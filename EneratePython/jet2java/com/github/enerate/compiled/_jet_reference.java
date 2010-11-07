package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_reference implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_reference() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_2_1 = new TagInfo("c:choose", //$NON-NLS-1$
            2, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_3_1 = new TagInfo("c:when", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_12 = new TagInfo("c:get", //$NON-NLS-1$
            5, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_9 = new TagInfo("c:if", //$NON-NLS-1$
            6, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_115 = new TagInfo("c:include", //$NON-NLS-1$
            6, 115,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_22 = new TagInfo("c:get", //$NON-NLS-1$
            8, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_12 = new TagInfo("c:get", //$NON-NLS-1$
            10, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_18 = new TagInfo("c:get", //$NON-NLS-1$
            11, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_19 = new TagInfo("c:get", //$NON-NLS-1$
            13, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_56 = new TagInfo("c:get", //$NON-NLS-1$
            13, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_15 = new TagInfo("c:get", //$NON-NLS-1$
            15, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_18 = new TagInfo("c:get", //$NON-NLS-1$
            16, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_19 = new TagInfo("c:get", //$NON-NLS-1$
            17, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_56 = new TagInfo("c:get", //$NON-NLS-1$
            17, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_5 = new TagInfo("c:get", //$NON-NLS-1$
            19, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_55 = new TagInfo("c:get", //$NON-NLS-1$
            19, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_95 = new TagInfo("c:get", //$NON-NLS-1$
            19, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_21_1 = new TagInfo("c:when", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_12 = new TagInfo("c:get", //$NON-NLS-1$
            23, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_9 = new TagInfo("c:if", //$NON-NLS-1$
            24, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_115 = new TagInfo("c:include", //$NON-NLS-1$
            24, 115,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_22 = new TagInfo("c:get", //$NON-NLS-1$
            26, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_12 = new TagInfo("c:get", //$NON-NLS-1$
            28, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_18 = new TagInfo("c:get", //$NON-NLS-1$
            29, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_41 = new TagInfo("c:get", //$NON-NLS-1$
            31, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_77 = new TagInfo("c:get", //$NON-NLS-1$
            31, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_19 = new TagInfo("c:get", //$NON-NLS-1$
            32, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_56 = new TagInfo("c:get", //$NON-NLS-1$
            32, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_15 = new TagInfo("c:get", //$NON-NLS-1$
            34, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_18 = new TagInfo("c:get", //$NON-NLS-1$
            35, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_19 = new TagInfo("c:get", //$NON-NLS-1$
            36, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_56 = new TagInfo("c:get", //$NON-NLS-1$
            36, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_5 = new TagInfo("c:get", //$NON-NLS-1$
            38, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_55 = new TagInfo("c:get", //$NON-NLS-1$
            38, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_95 = new TagInfo("c:get", //$NON-NLS-1$
            38, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_40_1 = new TagInfo("c:when", //$NON-NLS-1$
            40, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_12 = new TagInfo("c:get", //$NON-NLS-1$
            42, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_9 = new TagInfo("c:if", //$NON-NLS-1$
            43, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_43_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            43, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_43_115 = new TagInfo("c:include", //$NON-NLS-1$
            43, 115,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_22 = new TagInfo("c:get", //$NON-NLS-1$
            45, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_12 = new TagInfo("c:get", //$NON-NLS-1$
            47, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_24 = new TagInfo("c:get", //$NON-NLS-1$
            48, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_16 = new TagInfo("c:get", //$NON-NLS-1$
            50, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_16 = new TagInfo("c:get", //$NON-NLS-1$
            52, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_15 = new TagInfo("c:get", //$NON-NLS-1$
            53, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_5 = new TagInfo("c:get", //$NON-NLS-1$
            55, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_55 = new TagInfo("c:get", //$NON-NLS-1$
            55, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_95 = new TagInfo("c:get", //$NON-NLS-1$
            55, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_12 = new TagInfo("c:get", //$NON-NLS-1$
            57, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_55 = new TagInfo("c:get", //$NON-NLS-1$
            57, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_20 = new TagInfo("c:get", //$NON-NLS-1$
            58, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_18 = new TagInfo("c:get", //$NON-NLS-1$
            59, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_19 = new TagInfo("c:get", //$NON-NLS-1$
            60, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_15 = new TagInfo("c:get", //$NON-NLS-1$
            62, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_58 = new TagInfo("c:get", //$NON-NLS-1$
            62, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_20 = new TagInfo("c:get", //$NON-NLS-1$
            63, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_18 = new TagInfo("c:get", //$NON-NLS-1$
            64, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_19 = new TagInfo("c:get", //$NON-NLS-1$
            65, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_1 = new TagInfo("c:when", //$NON-NLS-1$
            67, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_12 = new TagInfo("c:get", //$NON-NLS-1$
            69, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_70_9 = new TagInfo("c:if", //$NON-NLS-1$
            70, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_70_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            70, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_70_115 = new TagInfo("c:include", //$NON-NLS-1$
            70, 115,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_22 = new TagInfo("c:get", //$NON-NLS-1$
            72, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_12 = new TagInfo("c:get", //$NON-NLS-1$
            74, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_24 = new TagInfo("c:get", //$NON-NLS-1$
            75, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_38 = new TagInfo("c:get", //$NON-NLS-1$
            77, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_19 = new TagInfo("c:get", //$NON-NLS-1$
            78, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_56 = new TagInfo("c:get", //$NON-NLS-1$
            78, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_31 = new TagInfo("c:get", //$NON-NLS-1$
            80, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_20 = new TagInfo("c:get", //$NON-NLS-1$
            81, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_15 = new TagInfo("c:get", //$NON-NLS-1$
            82, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_5 = new TagInfo("c:get", //$NON-NLS-1$
            84, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_55 = new TagInfo("c:get", //$NON-NLS-1$
            84, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_95 = new TagInfo("c:get", //$NON-NLS-1$
            84, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_12 = new TagInfo("c:get", //$NON-NLS-1$
            86, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_55 = new TagInfo("c:get", //$NON-NLS-1$
            86, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_20 = new TagInfo("c:get", //$NON-NLS-1$
            87, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_33 = new TagInfo("c:get", //$NON-NLS-1$
            88, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_22 = new TagInfo("c:get", //$NON-NLS-1$
            89, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_19 = new TagInfo("c:get", //$NON-NLS-1$
            90, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_15 = new TagInfo("c:get", //$NON-NLS-1$
            92, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_58 = new TagInfo("c:get", //$NON-NLS-1$
            92, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_20 = new TagInfo("c:get", //$NON-NLS-1$
            93, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_29 = new TagInfo("c:get", //$NON-NLS-1$
            94, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_22 = new TagInfo("c:get", //$NON-NLS-1$
            95, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_19 = new TagInfo("c:get", //$NON-NLS-1$
            96, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_99_1 = new TagInfo("c:when", //$NON-NLS-1$
            99, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_100_1 = new TagInfo("c:if", //$NON-NLS-1$
            100, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_101_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            101, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_102_7 = new TagInfo("c:include", //$NON-NLS-1$
            102, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_5 = new TagInfo("c:get", //$NON-NLS-1$
            104, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_107_1 = new TagInfo("c:when", //$NON-NLS-1$
            107, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_13 = new TagInfo("c:get", //$NON-NLS-1$
            109, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_56 = new TagInfo("c:get", //$NON-NLS-1$
            109, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_20 = new TagInfo("c:get", //$NON-NLS-1$
            110, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_18 = new TagInfo("c:get", //$NON-NLS-1$
            111, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_16 = new TagInfo("c:get", //$NON-NLS-1$
            113, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_59 = new TagInfo("c:get", //$NON-NLS-1$
            113, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_20 = new TagInfo("c:get", //$NON-NLS-1$
            114, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_18 = new TagInfo("c:get", //$NON-NLS-1$
            115, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_choose_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_2_1.setRuntimeParent(null);
        _jettag_c_choose_2_1.setTagInfo(_td_c_choose_2_1);
        _jettag_c_choose_2_1.doStart(context, out);
        JET2Writer _jettag_c_choose_2_1_saved_out = out;
        while (_jettag_c_choose_2_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_3_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_3_1.setTagInfo(_td_c_when_3_1);
            _jettag_c_when_3_1.doStart(context, out);
            JET2Writer _jettag_c_when_3_1_saved_out = out;
            while (_jettag_c_when_3_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // One-to-one (1..1) association. 
                out.write("    def get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_12.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_5_12.setTagInfo(_td_c_get_5_12);
                _jettag_c_get_5_12.doStart(context, out);
                _jettag_c_get_5_12.doEnd();
                out.write("(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_6_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_9.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_if_6_9.setTagInfo(_td_c_if_6_9);
                _jettag_c_if_6_9.doStart(context, out);
                while (_jettag_c_if_6_9.okToProcessBody()) {
                    out.write("\"\"\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_6_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_6_61.setRuntimeParent(_jettag_c_if_6_9);
                    _jettag_c_setVariable_6_61.setTagInfo(_td_c_setVariable_6_61);
                    _jettag_c_setVariable_6_61.doStart(context, out);
                    _jettag_c_setVariable_6_61.doEnd();
                    RuntimeTagElement _jettag_c_include_6_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_6_115.setRuntimeParent(_jettag_c_if_6_9);
                    _jettag_c_include_6_115.setTagInfo(_td_c_include_6_115);
                    _jettag_c_include_6_115.doStart(context, out);
                    _jettag_c_include_6_115.doEnd();
                    out.write(NL);         
                    out.write("        \"\"\"");  //$NON-NLS-1$        
                    _jettag_c_if_6_9.handleBodyContent(out);
                }
                _jettag_c_if_6_9.doEnd();
                out.write(NL);         
                out.write("        return self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_22.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_8_22.setTagInfo(_td_c_get_8_22);
                _jettag_c_get_8_22.doStart(context, out);
                _jettag_c_get_8_22.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("    def set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_12.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_10_12.setTagInfo(_td_c_get_10_12);
                _jettag_c_get_10_12.doStart(context, out);
                _jettag_c_get_10_12.doEnd();
                out.write("(self, value):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_18.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_11_18.setTagInfo(_td_c_get_11_18);
                _jettag_c_get_11_18.doStart(context, out);
                _jettag_c_get_11_18.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                // Unset the old opposite reference. 
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_19.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_13_19.setTagInfo(_td_c_get_13_19);
                _jettag_c_get_13_19.doStart(context, out);
                _jettag_c_get_13_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_56.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_13_56.setTagInfo(_td_c_get_13_56);
                _jettag_c_get_13_56.doStart(context, out);
                _jettag_c_get_13_56.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_15_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_15.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_15_15.setTagInfo(_td_c_get_15_15);
                _jettag_c_get_15_15.doStart(context, out);
                _jettag_c_get_15_15.doEnd();
                out.write(" = value");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_18.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_16_18.setTagInfo(_td_c_get_16_18);
                _jettag_c_get_16_18.doStart(context, out);
                _jettag_c_get_16_18.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_19.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_17_19.setTagInfo(_td_c_get_17_19);
                _jettag_c_get_17_19.doStart(context, out);
                _jettag_c_get_17_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_56.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_17_56.setTagInfo(_td_c_get_17_56);
                _jettag_c_get_17_56.doStart(context, out);
                _jettag_c_get_17_56.doEnd();
                out.write(" = self");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_5.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_19_5.setTagInfo(_td_c_get_19_5);
                _jettag_c_get_19_5.doStart(context, out);
                _jettag_c_get_19_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_55.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_19_55.setTagInfo(_td_c_get_19_55);
                _jettag_c_get_19_55.doStart(context, out);
                _jettag_c_get_19_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_95.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_19_95.setTagInfo(_td_c_get_19_95);
                _jettag_c_get_19_95.doStart(context, out);
                _jettag_c_get_19_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_3_1.handleBodyContent(out);
            }
            out = _jettag_c_when_3_1_saved_out;
            _jettag_c_when_3_1.doEnd();
            RuntimeTagElement _jettag_c_when_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_21_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_21_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_21_1.setTagInfo(_td_c_when_21_1);
            _jettag_c_when_21_1.doStart(context, out);
            JET2Writer _jettag_c_when_21_1_saved_out = out;
            while (_jettag_c_when_21_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // One-to-many (1..n) association. 
                out.write("    def get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_12.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_23_12.setTagInfo(_td_c_get_23_12);
                _jettag_c_get_23_12.doStart(context, out);
                _jettag_c_get_23_12.doEnd();
                out.write("(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_24_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_24_9.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_if_24_9.setTagInfo(_td_c_if_24_9);
                _jettag_c_if_24_9.doStart(context, out);
                while (_jettag_c_if_24_9.okToProcessBody()) {
                    out.write("\"\"\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_24_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_24_61.setRuntimeParent(_jettag_c_if_24_9);
                    _jettag_c_setVariable_24_61.setTagInfo(_td_c_setVariable_24_61);
                    _jettag_c_setVariable_24_61.doStart(context, out);
                    _jettag_c_setVariable_24_61.doEnd();
                    RuntimeTagElement _jettag_c_include_24_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_24_115.setRuntimeParent(_jettag_c_if_24_9);
                    _jettag_c_include_24_115.setTagInfo(_td_c_include_24_115);
                    _jettag_c_include_24_115.doStart(context, out);
                    _jettag_c_include_24_115.doEnd();
                    out.write(NL);         
                    out.write("        \"\"\"");  //$NON-NLS-1$        
                    _jettag_c_if_24_9.handleBodyContent(out);
                }
                _jettag_c_if_24_9.doEnd();
                out.write(NL);         
                out.write("        return self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_22.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_26_22.setTagInfo(_td_c_get_26_22);
                _jettag_c_get_26_22.doStart(context, out);
                _jettag_c_get_26_22.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("    def set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_12.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_28_12.setTagInfo(_td_c_get_28_12);
                _jettag_c_get_28_12.doStart(context, out);
                _jettag_c_get_28_12.doEnd();
                out.write("(self, value):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_29_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_18.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_29_18.setTagInfo(_td_c_get_29_18);
                _jettag_c_get_29_18.doStart(context, out);
                _jettag_c_get_29_18.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                // Remove self from old object's list. 
                out.write("            filtered = [x for x in self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_31_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_41.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_31_41.setTagInfo(_td_c_get_31_41);
                _jettag_c_get_31_41.doStart(context, out);
                _jettag_c_get_31_41.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_31_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_77.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_31_77.setTagInfo(_td_c_get_31_77);
                _jettag_c_get_31_77.doStart(context, out);
                _jettag_c_get_31_77.doEnd();
                out.write(" if x != self]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_19.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_32_19.setTagInfo(_td_c_get_32_19);
                _jettag_c_get_32_19.doStart(context, out);
                _jettag_c_get_32_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_56.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_32_56.setTagInfo(_td_c_get_32_56);
                _jettag_c_get_32_56.doStart(context, out);
                _jettag_c_get_32_56.doEnd();
                out.write(" = filtered");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_15.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_34_15.setTagInfo(_td_c_get_34_15);
                _jettag_c_get_34_15.doStart(context, out);
                _jettag_c_get_34_15.doEnd();
                out.write(" = value");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_18.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_35_18.setTagInfo(_td_c_get_35_18);
                _jettag_c_get_35_18.doStart(context, out);
                _jettag_c_get_35_18.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_19.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_36_19.setTagInfo(_td_c_get_36_19);
                _jettag_c_get_36_19.doStart(context, out);
                _jettag_c_get_36_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_56.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_36_56.setTagInfo(_td_c_get_36_56);
                _jettag_c_get_36_56.doStart(context, out);
                _jettag_c_get_36_56.doEnd();
                out.write(".append(self)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_5.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_38_5.setTagInfo(_td_c_get_38_5);
                _jettag_c_get_38_5.doStart(context, out);
                _jettag_c_get_38_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_55.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_38_55.setTagInfo(_td_c_get_38_55);
                _jettag_c_get_38_55.doStart(context, out);
                _jettag_c_get_38_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_95.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_38_95.setTagInfo(_td_c_get_38_95);
                _jettag_c_get_38_95.doStart(context, out);
                _jettag_c_get_38_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_21_1.handleBodyContent(out);
            }
            out = _jettag_c_when_21_1_saved_out;
            _jettag_c_when_21_1.doEnd();
            RuntimeTagElement _jettag_c_when_40_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_40_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_40_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_40_1.setTagInfo(_td_c_when_40_1);
            _jettag_c_when_40_1.doStart(context, out);
            JET2Writer _jettag_c_when_40_1_saved_out = out;
            while (_jettag_c_when_40_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Many-to-one (n..1) association. 
                out.write("    def get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_42_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_12.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_42_12.setTagInfo(_td_c_get_42_12);
                _jettag_c_get_42_12.doStart(context, out);
                _jettag_c_get_42_12.doEnd();
                out.write("(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_43_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_43_9.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_if_43_9.setTagInfo(_td_c_if_43_9);
                _jettag_c_if_43_9.doStart(context, out);
                while (_jettag_c_if_43_9.okToProcessBody()) {
                    out.write("\"\"\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_43_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_43_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_43_61.setRuntimeParent(_jettag_c_if_43_9);
                    _jettag_c_setVariable_43_61.setTagInfo(_td_c_setVariable_43_61);
                    _jettag_c_setVariable_43_61.doStart(context, out);
                    _jettag_c_setVariable_43_61.doEnd();
                    RuntimeTagElement _jettag_c_include_43_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_43_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_43_115.setRuntimeParent(_jettag_c_if_43_9);
                    _jettag_c_include_43_115.setTagInfo(_td_c_include_43_115);
                    _jettag_c_include_43_115.doStart(context, out);
                    _jettag_c_include_43_115.doEnd();
                    out.write(NL);         
                    out.write("        \"\"\"");  //$NON-NLS-1$        
                    _jettag_c_if_43_9.handleBodyContent(out);
                }
                _jettag_c_if_43_9.doEnd();
                out.write(NL);         
                out.write("        return self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_45_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_22.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_45_22.setTagInfo(_td_c_get_45_22);
                _jettag_c_get_45_22.doStart(context, out);
                _jettag_c_get_45_22.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("    def set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_47_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_12.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_47_12.setTagInfo(_td_c_get_47_12);
                _jettag_c_get_47_12.doStart(context, out);
                _jettag_c_get_47_12.doEnd();
                out.write("(self, value):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for x in self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_24.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_48_24.setTagInfo(_td_c_get_48_24);
                _jettag_c_get_48_24.doStart(context, out);
                _jettag_c_get_48_24.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                // Unset the old oppopsite references. 
                out.write("            x._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_16.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_50_16.setTagInfo(_td_c_get_50_16);
                _jettag_c_get_50_16.doStart(context, out);
                _jettag_c_get_50_16.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for y in value:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            y._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_16.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_52_16.setTagInfo(_td_c_get_52_16);
                _jettag_c_get_52_16.doStart(context, out);
                _jettag_c_get_52_16.doEnd();
                out.write(" = self");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_53_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_15.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_53_15.setTagInfo(_td_c_get_53_15);
                _jettag_c_get_53_15.doStart(context, out);
                _jettag_c_get_53_15.doEnd();
                out.write(" = value");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_5.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_55_5.setTagInfo(_td_c_get_55_5);
                _jettag_c_get_55_5.doStart(context, out);
                _jettag_c_get_55_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_55.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_55_55.setTagInfo(_td_c_get_55_55);
                _jettag_c_get_55_55.doStart(context, out);
                _jettag_c_get_55_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_95.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_55_95.setTagInfo(_td_c_get_55_95);
                _jettag_c_get_55_95.doStart(context, out);
                _jettag_c_get_55_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def add");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_57_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_12.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_57_12.setTagInfo(_td_c_get_57_12);
                _jettag_c_get_57_12.doStart(context, out);
                _jettag_c_get_57_12.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_57_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_55.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_57_55.setTagInfo(_td_c_get_57_55);
                _jettag_c_get_57_55.doStart(context, out);
                _jettag_c_get_57_55.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_58_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_20.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_58_20.setTagInfo(_td_c_get_58_20);
                _jettag_c_get_58_20.doStart(context, out);
                _jettag_c_get_58_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            obj._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_59_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_59_18.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_59_18.setTagInfo(_td_c_get_59_18);
                _jettag_c_get_59_18.doStart(context, out);
                _jettag_c_get_59_18.doEnd();
                out.write(" = self");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_60_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_19.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_60_19.setTagInfo(_td_c_get_60_19);
                _jettag_c_get_60_19.doStart(context, out);
                _jettag_c_get_60_19.doEnd();
                out.write(".append(obj)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def remove");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_15.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_62_15.setTagInfo(_td_c_get_62_15);
                _jettag_c_get_62_15.doStart(context, out);
                _jettag_c_get_62_15.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_58.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_62_58.setTagInfo(_td_c_get_62_58);
                _jettag_c_get_62_58.doStart(context, out);
                _jettag_c_get_62_58.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_63_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_20.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_63_20.setTagInfo(_td_c_get_63_20);
                _jettag_c_get_63_20.doStart(context, out);
                _jettag_c_get_63_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            obj._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_64_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_18.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_64_18.setTagInfo(_td_c_get_64_18);
                _jettag_c_get_64_18.doStart(context, out);
                _jettag_c_get_64_18.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_65_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_19.setRuntimeParent(_jettag_c_when_40_1);
                _jettag_c_get_65_19.setTagInfo(_td_c_get_65_19);
                _jettag_c_get_65_19.doStart(context, out);
                _jettag_c_get_65_19.doEnd();
                out.write(".remove(obj)");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_40_1.handleBodyContent(out);
            }
            out = _jettag_c_when_40_1_saved_out;
            _jettag_c_when_40_1.doEnd();
            RuntimeTagElement _jettag_c_when_67_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_67_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_67_1.setTagInfo(_td_c_when_67_1);
            _jettag_c_when_67_1.doStart(context, out);
            JET2Writer _jettag_c_when_67_1_saved_out = out;
            while (_jettag_c_when_67_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Many-to-many (n..n) association. 
                out.write("    def get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_69_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_69_12.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_69_12.setTagInfo(_td_c_get_69_12);
                _jettag_c_get_69_12.doStart(context, out);
                _jettag_c_get_69_12.doEnd();
                out.write("(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_70_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_70_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_70_9.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_if_70_9.setTagInfo(_td_c_if_70_9);
                _jettag_c_if_70_9.doStart(context, out);
                while (_jettag_c_if_70_9.okToProcessBody()) {
                    out.write("\"\"\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_70_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_70_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_70_61.setRuntimeParent(_jettag_c_if_70_9);
                    _jettag_c_setVariable_70_61.setTagInfo(_td_c_setVariable_70_61);
                    _jettag_c_setVariable_70_61.doStart(context, out);
                    _jettag_c_setVariable_70_61.doEnd();
                    RuntimeTagElement _jettag_c_include_70_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_70_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_70_115.setRuntimeParent(_jettag_c_if_70_9);
                    _jettag_c_include_70_115.setTagInfo(_td_c_include_70_115);
                    _jettag_c_include_70_115.doStart(context, out);
                    _jettag_c_include_70_115.doEnd();
                    out.write(NL);         
                    out.write("        \"\"\"");  //$NON-NLS-1$        
                    _jettag_c_if_70_9.handleBodyContent(out);
                }
                _jettag_c_if_70_9.doEnd();
                out.write(NL);         
                out.write("        return self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_72_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_72_22.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_72_22.setTagInfo(_td_c_get_72_22);
                _jettag_c_get_72_22.doStart(context, out);
                _jettag_c_get_72_22.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("    def set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_74_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_74_12.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_74_12.setTagInfo(_td_c_get_74_12);
                _jettag_c_get_74_12.doStart(context, out);
                _jettag_c_get_74_12.doEnd();
                out.write("(self, value):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for p in self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_75_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_75_24.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_75_24.setTagInfo(_td_c_get_75_24);
                _jettag_c_get_75_24.doStart(context, out);
                _jettag_c_get_75_24.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                // Unset the old oppopsite references. 
                out.write("            filtered = [q for q in p.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_77_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_77_38.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_77_38.setTagInfo(_td_c_get_77_38);
                _jettag_c_get_77_38.doStart(context, out);
                _jettag_c_get_77_38.doEnd();
                out.write(" if q != self]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_78_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_19.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_78_19.setTagInfo(_td_c_get_78_19);
                _jettag_c_get_78_19.doStart(context, out);
                _jettag_c_get_78_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_78_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_56.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_78_56.setTagInfo(_td_c_get_78_56);
                _jettag_c_get_78_56.doStart(context, out);
                _jettag_c_get_78_56.doEnd();
                out.write(" = filtered");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for r in value:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            if self not in r._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_80_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_31); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_31.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_80_31.setTagInfo(_td_c_get_80_31);
                _jettag_c_get_80_31.doStart(context, out);
                _jettag_c_get_80_31.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                r._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_81_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_20.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_81_20.setTagInfo(_td_c_get_81_20);
                _jettag_c_get_81_20.doStart(context, out);
                _jettag_c_get_81_20.doEnd();
                out.write(".append(self)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_82_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_82_15.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_82_15.setTagInfo(_td_c_get_82_15);
                _jettag_c_get_82_15.doStart(context, out);
                _jettag_c_get_82_15.doEnd();
                out.write(" = value");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_84_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_5.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_84_5.setTagInfo(_td_c_get_84_5);
                _jettag_c_get_84_5.doStart(context, out);
                _jettag_c_get_84_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_84_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_55.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_84_55.setTagInfo(_td_c_get_84_55);
                _jettag_c_get_84_55.doStart(context, out);
                _jettag_c_get_84_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_84_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_84_95.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_84_95.setTagInfo(_td_c_get_84_95);
                _jettag_c_get_84_95.doStart(context, out);
                _jettag_c_get_84_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def add");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_86_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_12.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_86_12.setTagInfo(_td_c_get_86_12);
                _jettag_c_get_86_12.doStart(context, out);
                _jettag_c_get_86_12.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_86_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_86_55.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_86_55.setTagInfo(_td_c_get_86_55);
                _jettag_c_get_86_55.doStart(context, out);
                _jettag_c_get_86_55.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_87_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_20.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_87_20.setTagInfo(_td_c_get_87_20);
                _jettag_c_get_87_20.doStart(context, out);
                _jettag_c_get_87_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            if self not in obj._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_88_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_33); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_88_33.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_88_33.setTagInfo(_td_c_get_88_33);
                _jettag_c_get_88_33.doStart(context, out);
                _jettag_c_get_88_33.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                obj._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_89_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_22.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_89_22.setTagInfo(_td_c_get_89_22);
                _jettag_c_get_89_22.doStart(context, out);
                _jettag_c_get_89_22.doEnd();
                out.write(".append(self)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_90_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_90_19.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_90_19.setTagInfo(_td_c_get_90_19);
                _jettag_c_get_90_19.doStart(context, out);
                _jettag_c_get_90_19.doEnd();
                out.write(".append(obj)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def remove");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_92_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_15.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_92_15.setTagInfo(_td_c_get_92_15);
                _jettag_c_get_92_15.doStart(context, out);
                _jettag_c_get_92_15.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_92_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_58.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_92_58.setTagInfo(_td_c_get_92_58);
                _jettag_c_get_92_58.doStart(context, out);
                _jettag_c_get_92_58.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_93_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_93_20.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_93_20.setTagInfo(_td_c_get_93_20);
                _jettag_c_get_93_20.doStart(context, out);
                _jettag_c_get_93_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            if self in obj._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_94_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_94_29.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_94_29.setTagInfo(_td_c_get_94_29);
                _jettag_c_get_94_29.doStart(context, out);
                _jettag_c_get_94_29.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                obj._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_95_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_95_22.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_95_22.setTagInfo(_td_c_get_95_22);
                _jettag_c_get_95_22.doStart(context, out);
                _jettag_c_get_95_22.doEnd();
                out.write(".remove(self)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_96_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_96_19.setRuntimeParent(_jettag_c_when_67_1);
                _jettag_c_get_96_19.setTagInfo(_td_c_get_96_19);
                _jettag_c_get_96_19.doStart(context, out);
                _jettag_c_get_96_19.doEnd();
                out.write(".remove(obj)");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_67_1.handleBodyContent(out);
            }
            out = _jettag_c_when_67_1_saved_out;
            _jettag_c_when_67_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_99_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_99_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_99_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_99_1.setTagInfo(_td_c_when_99_1);
            _jettag_c_when_99_1.doStart(context, out);
            JET2Writer _jettag_c_when_99_1_saved_out = out;
            while (_jettag_c_when_99_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_if_100_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_100_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_100_1.setRuntimeParent(_jettag_c_when_99_1);
                _jettag_c_if_100_1.setTagInfo(_td_c_if_100_1);
                _jettag_c_if_100_1.doStart(context, out);
                while (_jettag_c_if_100_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_101_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_101_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_101_5.setRuntimeParent(_jettag_c_if_100_1);
                    _jettag_c_setVariable_101_5.setTagInfo(_td_c_setVariable_101_5);
                    _jettag_c_setVariable_101_5.doStart(context, out);
                    _jettag_c_setVariable_101_5.doEnd();
                    out.write("    # ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_include_102_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_102_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_102_7.setRuntimeParent(_jettag_c_if_100_1);
                    _jettag_c_include_102_7.setTagInfo(_td_c_include_102_7);
                    _jettag_c_include_102_7.doStart(context, out);
                    _jettag_c_include_102_7.doEnd();
                    out.write(NL);         
                    _jettag_c_if_100_1.handleBodyContent(out);
                }
                _jettag_c_if_100_1.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_104_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_104_5.setRuntimeParent(_jettag_c_when_99_1);
                _jettag_c_get_104_5.setTagInfo(_td_c_get_104_5);
                _jettag_c_get_104_5.doStart(context, out);
                _jettag_c_get_104_5.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_99_1.handleBodyContent(out);
            }
            out = _jettag_c_when_99_1_saved_out;
            _jettag_c_when_99_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_107_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_107_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_107_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_107_1.setTagInfo(_td_c_when_107_1);
            _jettag_c_when_107_1.doStart(context, out);
            JET2Writer _jettag_c_when_107_1_saved_out = out;
            while (_jettag_c_when_107_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Provide 'add' and 'remove' methods for consistency. 
                out.write("    def add_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_109_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_13.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_109_13.setTagInfo(_td_c_get_109_13);
                _jettag_c_get_109_13.doStart(context, out);
                _jettag_c_get_109_13.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_109_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_109_56.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_109_56.setTagInfo(_td_c_get_109_56);
                _jettag_c_get_109_56.doStart(context, out);
                _jettag_c_get_109_56.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_110_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_110_20.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_110_20.setTagInfo(_td_c_get_110_20);
                _jettag_c_get_110_20.doStart(context, out);
                _jettag_c_get_110_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_111_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_18.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_111_18.setTagInfo(_td_c_get_111_18);
                _jettag_c_get_111_18.doStart(context, out);
                _jettag_c_get_111_18.doEnd();
                out.write(".append(obj)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def remove_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_113_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_113_16.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_113_16.setTagInfo(_td_c_get_113_16);
                _jettag_c_get_113_16.doStart(context, out);
                _jettag_c_get_113_16.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_113_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_113_59.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_113_59.setTagInfo(_td_c_get_113_59);
                _jettag_c_get_113_59.doStart(context, out);
                _jettag_c_get_113_59.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_114_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_20.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_114_20.setTagInfo(_td_c_get_114_20);
                _jettag_c_get_114_20.doStart(context, out);
                _jettag_c_get_114_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_115_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_115_18.setRuntimeParent(_jettag_c_when_107_1);
                _jettag_c_get_115_18.setTagInfo(_td_c_get_115_18);
                _jettag_c_get_115_18.doStart(context, out);
                _jettag_c_get_115_18.doEnd();
                out.write(".remove(obj)");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_107_1.handleBodyContent(out);
            }
            out = _jettag_c_when_107_1_saved_out;
            _jettag_c_when_107_1.doEnd();
            _jettag_c_choose_2_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_2_1_saved_out;
        _jettag_c_choose_2_1.doEnd();
    }
}
