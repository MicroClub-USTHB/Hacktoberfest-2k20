const mongoose=require("mongoose"),
    passportLocalMongoose = require( 'passport-local-mongoose' )
class user{
    schema=new mongoose.Schema({
        username     : { type : String , unique : true , required : true } ,
        password     : { type : String } 
    });
    model;
    constructor(){
        // plugin the passportLocal
        this.schema.plugin( passportLocalMongoose );
        //create the user
        this.model=mongoose.model("user",this.schema);
    }
    async createUser(username,password,callback){
        try {
            console.log(this.model.register);
            let user = await this.model.register( new this.model( { username } ) , password );
            return callback( null , user );
        }
        catch ( e ) {
            return callback( e );
        }

    }
}
module.exports=new user();