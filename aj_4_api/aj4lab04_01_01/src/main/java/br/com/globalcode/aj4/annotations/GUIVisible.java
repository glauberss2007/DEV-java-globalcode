/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package aj_4_api.aj4lab04_01_01.aj4lab04_01_01.src.main.java.br.com.globalcode.aj4.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GUIVisible {

	String nomeCampo() default "Valor default";

}
