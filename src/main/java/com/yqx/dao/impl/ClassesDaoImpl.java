package com.yqx.dao.impl;

import org.springframework.stereotype.Repository;

import com.yqx.dao.ClassesDao;
import com.yqx.entity.Classes;

@Repository("classesDao")
public class ClassesDaoImpl extends BaseDaoImpl<Classes> implements ClassesDao{

}
