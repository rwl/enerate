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
    private static final TagInfo _td_c_get_17_55 = new TagInfo("c:get", //$NON-NLS-1$
            17, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_19 = new TagInfo("c:get", //$NON-NLS-1$
            18, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_56 = new TagInfo("c:get", //$NON-NLS-1$
            18, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_5 = new TagInfo("c:get", //$NON-NLS-1$
            20, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_55 = new TagInfo("c:get", //$NON-NLS-1$
            20, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_95 = new TagInfo("c:get", //$NON-NLS-1$
            20, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_22_1 = new TagInfo("c:when", //$NON-NLS-1$
            22, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_12 = new TagInfo("c:get", //$NON-NLS-1$
            24, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_9 = new TagInfo("c:if", //$NON-NLS-1$
            25, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_115 = new TagInfo("c:include", //$NON-NLS-1$
            25, 115,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_22 = new TagInfo("c:get", //$NON-NLS-1$
            27, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_12 = new TagInfo("c:get", //$NON-NLS-1$
            29, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_18 = new TagInfo("c:get", //$NON-NLS-1$
            30, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_41 = new TagInfo("c:get", //$NON-NLS-1$
            32, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_77 = new TagInfo("c:get", //$NON-NLS-1$
            32, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_19 = new TagInfo("c:get", //$NON-NLS-1$
            33, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_56 = new TagInfo("c:get", //$NON-NLS-1$
            33, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_15 = new TagInfo("c:get", //$NON-NLS-1$
            35, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_18 = new TagInfo("c:get", //$NON-NLS-1$
            36, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_34 = new TagInfo("c:get", //$NON-NLS-1$
            37, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_71 = new TagInfo("c:get", //$NON-NLS-1$
            37, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_23 = new TagInfo("c:get", //$NON-NLS-1$
            38, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_60 = new TagInfo("c:get", //$NON-NLS-1$
            38, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_5 = new TagInfo("c:get", //$NON-NLS-1$
            40, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_55 = new TagInfo("c:get", //$NON-NLS-1$
            40, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_95 = new TagInfo("c:get", //$NON-NLS-1$
            40, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_42_1 = new TagInfo("c:when", //$NON-NLS-1$
            42, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_12 = new TagInfo("c:get", //$NON-NLS-1$
            44, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_9 = new TagInfo("c:if", //$NON-NLS-1$
            45, 9,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_61 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 61,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_45_115 = new TagInfo("c:include", //$NON-NLS-1$
            45, 115,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_22 = new TagInfo("c:get", //$NON-NLS-1$
            47, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_12 = new TagInfo("c:get", //$NON-NLS-1$
            49, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_24 = new TagInfo("c:get", //$NON-NLS-1$
            50, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_15 = new TagInfo("c:get", //$NON-NLS-1$
            52, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_16 = new TagInfo("c:get", //$NON-NLS-1$
            54, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_15 = new TagInfo("c:get", //$NON-NLS-1$
            55, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_5 = new TagInfo("c:get", //$NON-NLS-1$
            57, 5,
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
    private static final TagInfo _td_c_get_57_95 = new TagInfo("c:get", //$NON-NLS-1$
            57, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_12 = new TagInfo("c:get", //$NON-NLS-1$
            59, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_55 = new TagInfo("c:get", //$NON-NLS-1$
            59, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_20 = new TagInfo("c:get", //$NON-NLS-1$
            60, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_17 = new TagInfo("c:get", //$NON-NLS-1$
            61, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_15 = new TagInfo("c:get", //$NON-NLS-1$
            63, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_58 = new TagInfo("c:get", //$NON-NLS-1$
            63, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_20 = new TagInfo("c:get", //$NON-NLS-1$
            64, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_17 = new TagInfo("c:get", //$NON-NLS-1$
            65, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
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
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_55.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_17_55.setTagInfo(_td_c_get_17_55);
                _jettag_c_get_17_55.doStart(context, out);
                _jettag_c_get_17_55.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_19.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_18_19.setTagInfo(_td_c_get_18_19);
                _jettag_c_get_18_19.doStart(context, out);
                _jettag_c_get_18_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_56.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_18_56.setTagInfo(_td_c_get_18_56);
                _jettag_c_get_18_56.doStart(context, out);
                _jettag_c_get_18_56.doEnd();
                out.write(" = self");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_20_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_5.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_20_5.setTagInfo(_td_c_get_20_5);
                _jettag_c_get_20_5.doStart(context, out);
                _jettag_c_get_20_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_20_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_55.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_20_55.setTagInfo(_td_c_get_20_55);
                _jettag_c_get_20_55.doStart(context, out);
                _jettag_c_get_20_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_20_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_95.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_20_95.setTagInfo(_td_c_get_20_95);
                _jettag_c_get_20_95.doStart(context, out);
                _jettag_c_get_20_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_3_1.handleBodyContent(out);
            }
            out = _jettag_c_when_3_1_saved_out;
            _jettag_c_when_3_1.doEnd();
            RuntimeTagElement _jettag_c_when_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_22_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_22_1.setTagInfo(_td_c_when_22_1);
            _jettag_c_when_22_1.doStart(context, out);
            JET2Writer _jettag_c_when_22_1_saved_out = out;
            while (_jettag_c_when_22_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // One-to-many (1..n) association. 
                out.write("    def get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_12.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_24_12.setTagInfo(_td_c_get_24_12);
                _jettag_c_get_24_12.doStart(context, out);
                _jettag_c_get_24_12.doEnd();
                out.write("(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_25_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_9.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_if_25_9.setTagInfo(_td_c_if_25_9);
                _jettag_c_if_25_9.doStart(context, out);
                while (_jettag_c_if_25_9.okToProcessBody()) {
                    out.write("\"\"\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_25_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_25_61.setRuntimeParent(_jettag_c_if_25_9);
                    _jettag_c_setVariable_25_61.setTagInfo(_td_c_setVariable_25_61);
                    _jettag_c_setVariable_25_61.doStart(context, out);
                    _jettag_c_setVariable_25_61.doEnd();
                    RuntimeTagElement _jettag_c_include_25_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_25_115.setRuntimeParent(_jettag_c_if_25_9);
                    _jettag_c_include_25_115.setTagInfo(_td_c_include_25_115);
                    _jettag_c_include_25_115.doStart(context, out);
                    _jettag_c_include_25_115.doEnd();
                    out.write(NL);         
                    out.write("        \"\"\"");  //$NON-NLS-1$        
                    _jettag_c_if_25_9.handleBodyContent(out);
                }
                _jettag_c_if_25_9.doEnd();
                out.write(NL);         
                out.write("        return self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_22.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_27_22.setTagInfo(_td_c_get_27_22);
                _jettag_c_get_27_22.doStart(context, out);
                _jettag_c_get_27_22.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("    def set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_29_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_12.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_29_12.setTagInfo(_td_c_get_29_12);
                _jettag_c_get_29_12.doStart(context, out);
                _jettag_c_get_29_12.doEnd();
                out.write("(self, value):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_30_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_18.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_30_18.setTagInfo(_td_c_get_30_18);
                _jettag_c_get_30_18.doStart(context, out);
                _jettag_c_get_30_18.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                // Remove self from old object's list. 
                out.write("            filtered = [x for x in self.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_41.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_32_41.setTagInfo(_td_c_get_32_41);
                _jettag_c_get_32_41.doStart(context, out);
                _jettag_c_get_32_41.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_77.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_32_77.setTagInfo(_td_c_get_32_77);
                _jettag_c_get_32_77.doStart(context, out);
                _jettag_c_get_32_77.doEnd();
                out.write(" if x != self]");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_19.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_33_19.setTagInfo(_td_c_get_33_19);
                _jettag_c_get_33_19.doStart(context, out);
                _jettag_c_get_33_19.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_56); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_56.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_33_56.setTagInfo(_td_c_get_33_56);
                _jettag_c_get_33_56.doStart(context, out);
                _jettag_c_get_33_56.doEnd();
                out.write(" = filtered");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_15.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_35_15.setTagInfo(_td_c_get_35_15);
                _jettag_c_get_35_15.doStart(context, out);
                _jettag_c_get_35_15.doEnd();
                out.write(" = value");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        if self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_18.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_36_18.setTagInfo(_td_c_get_36_18);
                _jettag_c_get_36_18.doStart(context, out);
                _jettag_c_get_36_18.doEnd();
                out.write(" is not None:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            if self not in self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_34); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_34.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_37_34.setTagInfo(_td_c_get_37_34);
                _jettag_c_get_37_34.doStart(context, out);
                _jettag_c_get_37_34.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_71.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_37_71.setTagInfo(_td_c_get_37_71);
                _jettag_c_get_37_71.doStart(context, out);
                _jettag_c_get_37_71.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("                self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_23.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_38_23.setTagInfo(_td_c_get_38_23);
                _jettag_c_get_38_23.doStart(context, out);
                _jettag_c_get_38_23.doEnd();
                out.write("._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_60.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_38_60.setTagInfo(_td_c_get_38_60);
                _jettag_c_get_38_60.doStart(context, out);
                _jettag_c_get_38_60.doEnd();
                out.write(".append(self)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_40_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_5.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_40_5.setTagInfo(_td_c_get_40_5);
                _jettag_c_get_40_5.doStart(context, out);
                _jettag_c_get_40_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_40_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_55.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_40_55.setTagInfo(_td_c_get_40_55);
                _jettag_c_get_40_55.doStart(context, out);
                _jettag_c_get_40_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_40_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_95.setRuntimeParent(_jettag_c_when_22_1);
                _jettag_c_get_40_95.setTagInfo(_td_c_get_40_95);
                _jettag_c_get_40_95.doStart(context, out);
                _jettag_c_get_40_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_22_1.handleBodyContent(out);
            }
            out = _jettag_c_when_22_1_saved_out;
            _jettag_c_when_22_1.doEnd();
            RuntimeTagElement _jettag_c_when_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_42_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_42_1.setRuntimeParent(_jettag_c_choose_2_1);
            _jettag_c_when_42_1.setTagInfo(_td_c_when_42_1);
            _jettag_c_when_42_1.doStart(context, out);
            JET2Writer _jettag_c_when_42_1_saved_out = out;
            while (_jettag_c_when_42_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Many-to-one (n..1) association. 
                out.write("    def get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_12.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_44_12.setTagInfo(_td_c_get_44_12);
                _jettag_c_get_44_12.doStart(context, out);
                _jettag_c_get_44_12.doEnd();
                out.write("(self):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_45_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_45_9.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_if_45_9.setTagInfo(_td_c_if_45_9);
                _jettag_c_if_45_9.doStart(context, out);
                while (_jettag_c_if_45_9.okToProcessBody()) {
                    out.write("\"\"\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_45_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_45_61.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_setVariable_45_61.setTagInfo(_td_c_setVariable_45_61);
                    _jettag_c_setVariable_45_61.doStart(context, out);
                    _jettag_c_setVariable_45_61.doEnd();
                    RuntimeTagElement _jettag_c_include_45_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_45_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_45_115.setRuntimeParent(_jettag_c_if_45_9);
                    _jettag_c_include_45_115.setTagInfo(_td_c_include_45_115);
                    _jettag_c_include_45_115.doStart(context, out);
                    _jettag_c_include_45_115.doEnd();
                    out.write(NL);         
                    out.write("        \"\"\"");  //$NON-NLS-1$        
                    _jettag_c_if_45_9.handleBodyContent(out);
                }
                _jettag_c_if_45_9.doEnd();
                out.write(NL);         
                out.write("        return self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_47_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_22.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_47_22.setTagInfo(_td_c_get_47_22);
                _jettag_c_get_47_22.doStart(context, out);
                _jettag_c_get_47_22.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("    def set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_12.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_49_12.setTagInfo(_td_c_get_49_12);
                _jettag_c_get_49_12.doStart(context, out);
                _jettag_c_get_49_12.doEnd();
                out.write("(self, value):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for x in self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_24.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_50_24.setTagInfo(_td_c_get_50_24);
                _jettag_c_get_50_24.doStart(context, out);
                _jettag_c_get_50_24.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                // Unset the old oppopsite references. 
                out.write("            x.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_15.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_52_15.setTagInfo(_td_c_get_52_15);
                _jettag_c_get_52_15.doStart(context, out);
                _jettag_c_get_52_15.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for y in value:");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            y._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_54_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_16.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_54_16.setTagInfo(_td_c_get_54_16);
                _jettag_c_get_54_16.doStart(context, out);
                _jettag_c_get_54_16.doEnd();
                out.write(" = self");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        self._");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_15.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_55_15.setTagInfo(_td_c_get_55_15);
                _jettag_c_get_55_15.doStart(context, out);
                _jettag_c_get_55_15.doEnd();
                out.write(" = value");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_57_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_5.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_57_5.setTagInfo(_td_c_get_57_5);
                _jettag_c_get_57_5.doStart(context, out);
                _jettag_c_get_57_5.doEnd();
                out.write(" = property(get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_57_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_55.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_57_55.setTagInfo(_td_c_get_57_55);
                _jettag_c_get_57_55.doStart(context, out);
                _jettag_c_get_57_55.doEnd();
                out.write(", set");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_57_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_95.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_57_95.setTagInfo(_td_c_get_57_95);
                _jettag_c_get_57_95.doStart(context, out);
                _jettag_c_get_57_95.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def add");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_59_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_59_12.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_59_12.setTagInfo(_td_c_get_59_12);
                _jettag_c_get_59_12.doStart(context, out);
                _jettag_c_get_59_12.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_59_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_59_55.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_59_55.setTagInfo(_td_c_get_59_55);
                _jettag_c_get_59_55.doStart(context, out);
                _jettag_c_get_59_55.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_60_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_20.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_60_20.setTagInfo(_td_c_get_60_20);
                _jettag_c_get_60_20.doStart(context, out);
                _jettag_c_get_60_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            obj.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_61_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_17.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_61_17.setTagInfo(_td_c_get_61_17);
                _jettag_c_get_61_17.doStart(context, out);
                _jettag_c_get_61_17.doEnd();
                out.write(" = self");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("    def remove");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_63_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_15.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_63_15.setTagInfo(_td_c_get_63_15);
                _jettag_c_get_63_15.doStart(context, out);
                _jettag_c_get_63_15.doEnd();
                out.write("(self, *");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_63_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_58.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_63_58.setTagInfo(_td_c_get_63_58);
                _jettag_c_get_63_58.doStart(context, out);
                _jettag_c_get_63_58.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        for obj in ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_64_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_20.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_64_20.setTagInfo(_td_c_get_64_20);
                _jettag_c_get_64_20.doStart(context, out);
                _jettag_c_get_64_20.doEnd();
                out.write(":");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("            obj.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_65_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_17.setRuntimeParent(_jettag_c_when_42_1);
                _jettag_c_get_65_17.setTagInfo(_td_c_get_65_17);
                _jettag_c_get_65_17.doStart(context, out);
                _jettag_c_get_65_17.doEnd();
                out.write(" = None");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_42_1.handleBodyContent(out);
            }
            out = _jettag_c_when_42_1_saved_out;
            _jettag_c_when_42_1.doEnd();
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
