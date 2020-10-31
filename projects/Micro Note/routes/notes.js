const router=require("express").Router(),
    Note=require("../modules/note");
router.get("/" ,(req,res,next)=>{
    Note.getNotes(req.user._id,(error,Notes)=>{
        if(error) return next(error);
        res.render("Notes",{Notes})
    })
})
router
router.route("/create")

    .get((req,res,next)=>{
        res.render("createNote",{title:req.query.title});
    })
    .post((req,res,next)=>{
        Note.createNote({...req.body,owner:req.user._id},(error)=>{
            if(error) return next(error);
            res.redirect('/Notes')
        })
    })
router.get("/delete/:id",(req,res,next)=>{
    Note.removeNote(req.params.id,req.user._id,(error,note)=>{
        if(error) return next(error);
        res.redirect('/Notes')
    })
})
router.route("/edit/:id")
    .get((req,res,next)=>{
        Note.getNote(req.params.id,req.user._id,(error,note)=>{
            if(error) return next(error);
            res.render("editNote",{title:note.title,content:note.content,id:req.params.id});
        })
    })
    .post((req,res,next)=>{
        Note.editNote(req.params.id,req.body,req.user._id,(error,note)=>{
            if(error) return next(error);
            res.redirect('/Notes')
        })
    })
module.exports=router;