const mongoose=require("mongoose")
class note{
    schema=new mongoose.Schema({
        title : { type : String , required : true } ,
        content : { type : String } ,
        owner : { type : mongoose.Schema.ObjectId , ref:"user"},
    });
    model;
    constructor(){
        //create the note model
        this.model=mongoose.model("note",this.schema);
    }
    async createNote({title,content,owner},callback){
        try {
            let note = await this.model.create({title,content,owner});
            return callback( null , note );
        }
        catch ( e ) {
            return callback( e );
        }
    }
    async getNote(id,owner,callback){
        try {
            let note = await this.model.findById(id);
            if(!note.owner.equals(owner)) throw new Error("this user isn't authorised to get this note");
            return callback( null , note );
        }
        catch ( e ) {
            return callback( e );
        }
    }
    async editNote(id,Note,owner,callback){
        try {
            let note = await this.model.findById(id);
            if(!note.owner.equals(owner)) throw new Error("this user isn't authorised to edit this note");
            await note.updateOne(Note)
            return callback( null , note );
        }
        catch ( e ) {
            return callback( e );
        }
    }
    async removeNote(id,owner,callback){
        try {
            let note = await this.model.findById(id);
            if(!note.owner.equals(owner)) throw new Error("this user isn't authorised to remove this note");
            await note.remove()
            return callback( null );
        }
        catch ( e ) {
            return callback( e );
        }
    }
    async getNotes(owner,callback){
        try {
            let notes = await this.model.find({owner});
            return callback( null , notes );
        }
        catch ( e ) {
            return callback( e );
        }
    }
}
module.exports=new note();