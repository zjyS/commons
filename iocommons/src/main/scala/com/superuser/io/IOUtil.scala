package com.superuser.io

import java.io.File

object IOUtil {

  def getPath(path:String, isAbsolute:Boolean = false): List[String] ={
    val file = new File(path)

  }

  def getAbsolutePath(path:String): List[String] ={
    getPath(path,true)
  }

  def getRelativePath(path:String): List[String] ={
    getPath(path)
  }
}
