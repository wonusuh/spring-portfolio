/**
 * 
 */
package org.suh.domain;

import java.util.Date;

import lombok.Data;

/**
 * @author YONSAI
 *
 */
@Data // lombok으로 자동으로 getter, setter
public class UnitConverterVO {

	private int bno;

	private double fromunit;

	private String expression;

	private double tounit;

	private Date regdate;

}
