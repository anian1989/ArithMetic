package com.fanhanfei.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * ����Ԫע���Զ���ע��
 *
 */
@Target({ElementType.TYPE,ElementType.METHOD})//������
@Retention(RetentionPolicy.RUNTIME)//����ʱ��
@Inherited//����ɼ̳�
@Documented//������doc�ļ�
public @interface FHFDesc {

}
