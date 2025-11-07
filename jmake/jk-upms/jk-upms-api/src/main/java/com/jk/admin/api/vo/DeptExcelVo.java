package com.jk.admin.api.vo;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 部门导入导出
 */
@Data
public class DeptExcelVo implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 导入时候回显行号
	 */
    //	@ExcelLine
    //	@ExcelIgnore
    private Long lineNum;

    /**
	 * 上级部门
	 */
	@NotBlank(message = "上级部门不能为空")
    //	@ExcelProperty("上级部门")
	private String parentName;

	/**
	 * 部门名称
	 */
	@NotBlank(message = "部门名称不能为空")
	// @ExcelProperty("部门名称")
	private String name;

	/**
	 * 排序
	 */
	// @ExcelProperty(value = "排序值")
	private Integer sortOrder;

}
