package com.tjxcgt.ly.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tjxcgt.ly.entity.CommonFormMap;
import com.tjxcgt.ly.entity.user;
import com.tjxcgt.ly.service.UserService;

@RestController
@RequestMapping("/list")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	//显示用户
    @RequestMapping("/user")
    public List<user> index() throws Exception {
        return userService.getUser();
    }
    
    @RequestMapping("/copy")
    public void coo(String from, String to) throws Exception {
    	from = "C:/Users/yuanliucq/Desktop/a/chu/";
    	to = "C:/Users/yuanliucq/Desktop/a/jin/";
    	try { 
    		File dir = new File(from); 
    		
    		File[] files = dir.listFiles(); 
    		
    		if (files == null) return;
    		
    		File moveDir = new File(to); 
    		
    		if (!moveDir.exists()) { 
    			moveDir.mkdirs(); 
    		} 
    		List<CommonFormMap> tmpList = userService.getFileNames();
    		String name = "";
    		for (int i = 0; i < files.length; i++) { 
    			if (files[i].isDirectory()) { 
    				coo(files[i].getPath() ,to + "\\" + files[i].getName()); 
    				files[i].delete(); 
    			} 
    			for (int j = 0; j < tmpList.size(); j++) {
    				String aname = tmpList.get(j).get("FILE_NAME").toString();
    				String ap = tmpList.get(j).get("FILE_DIR").toString();
    				if(ap.equals(files[i].getName())){
    					name = aname;
    					break;
    				} else {
    					name = files[i].getName();
    				}
    				
				}
    			File moveFile = new File(moveDir.getPath() + "\\" + name); //疑是新名字
    			if (moveFile.exists()) { 
    				moveFile.delete(); 
    			} 
    			files[i].renameTo(moveFile); 
    		} 
    	} catch (Exception e) { 
    		e.printStackTrace();; 
    	} 
    }
}
