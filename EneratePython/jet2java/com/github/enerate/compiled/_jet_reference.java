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
    
    private static final TagInfo _td_c_userRegion_2_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            2, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_3_11 = new TagInfo("c:get", //$NON-NLS-1$
            3, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_4_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            4, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_6_1 = new TagInfo("c:choose", //$NON-NLS-1$
            6, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_7_1 = new TagInfo("c:when", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_13 = new TagInfo("c:get", //$NON-NLS-1$
            9, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_13 = new TagInfo("c:if", //$NON-NLS-1$
            10, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_62 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 62,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_10_116 = new TagInfo("c:include", //$NON-NLS-1$
            10, 116,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_22 = new TagInfo("c:get", //$NON-NLS-1$
            12, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_13 = new TagInfo("c:get", //$NON-NLS-1$
            14, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_18 = new TagInfo("c:get", //$NON-NLS-1$
            15, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_19 = new TagInfo("c:get", //$NON-NLS-1$
            17, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_68 = new TagInfo("c:get", //$NON-NLS-1$
            17, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_15 = new TagInfo("c:get", //$NON-NLS-1$
            19, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_18 = new TagInfo("c:get", //$NON-NLS-1$
            20, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_19 = new TagInfo("c:get", //$NON-NLS-1$
            21, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_68 = new TagInfo("c:get", //$NON-NLS-1$
            21, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_5 = new TagInfo("c:get", //$NON-NLS-1$
            23, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_68 = new TagInfo("c:get", //$NON-NLS-1$
            23, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_121 = new TagInfo("c:get", //$NON-NLS-1$
            23, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_25_1 = new TagInfo("c:when", //$NON-NLS-1$
            25, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_13 = new TagInfo("c:get", //$NON-NLS-1$
            27, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_13 = new TagInfo("c:if", //$NON-NLS-1$
            28, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_62 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 62,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_28_116 = new TagInfo("c:include", //$NON-NLS-1$
            28, 116,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_22 = new TagInfo("c:get", //$NON-NLS-1$
            30, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_13 = new TagInfo("c:get", //$NON-NLS-1$
            32, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_18 = new TagInfo("c:get", //$NON-NLS-1$
            33, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_41 = new TagInfo("c:get", //$NON-NLS-1$
            35, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_89 = new TagInfo("c:get", //$NON-NLS-1$
            35, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_19 = new TagInfo("c:get", //$NON-NLS-1$
            36, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_68 = new TagInfo("c:get", //$NON-NLS-1$
            36, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_15 = new TagInfo("c:get", //$NON-NLS-1$
            38, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_18 = new TagInfo("c:get", //$NON-NLS-1$
            39, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_19 = new TagInfo("c:get", //$NON-NLS-1$
            40, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_68 = new TagInfo("c:get", //$NON-NLS-1$
            40, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_5 = new TagInfo("c:get", //$NON-NLS-1$
            42, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_68 = new TagInfo("c:get", //$NON-NLS-1$
            42, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_121 = new TagInfo("c:get", //$NON-NLS-1$
            42, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_44_1 = new TagInfo("c:when", //$NON-NLS-1$
            44, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true' and $eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_13 = new TagInfo("c:get", //$NON-NLS-1$
            46, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_47_13 = new TagInfo("c:if", //$NON-NLS-1$
            47, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_62 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 62,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_47_116 = new TagInfo("c:include", //$NON-NLS-1$
            47, 116,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_22 = new TagInfo("c:get", //$NON-NLS-1$
            49, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_13 = new TagInfo("c:get", //$NON-NLS-1$
            51, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_24 = new TagInfo("c:get", //$NON-NLS-1$
            52, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_16 = new TagInfo("c:get", //$NON-NLS-1$
            54, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_16 = new TagInfo("c:get", //$NON-NLS-1$
            56, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_15 = new TagInfo("c:get", //$NON-NLS-1$
            57, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_5 = new TagInfo("c:get", //$NON-NLS-1$
            59, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_68 = new TagInfo("c:get", //$NON-NLS-1$
            59, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_121 = new TagInfo("c:get", //$NON-NLS-1$
            59, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_13 = new TagInfo("c:get", //$NON-NLS-1$
            61, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_68 = new TagInfo("c:get", //$NON-NLS-1$
            61, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_20 = new TagInfo("c:get", //$NON-NLS-1$
            62, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_18 = new TagInfo("c:get", //$NON-NLS-1$
            63, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_19 = new TagInfo("c:get", //$NON-NLS-1$
            64, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_16 = new TagInfo("c:get", //$NON-NLS-1$
            66, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_71 = new TagInfo("c:get", //$NON-NLS-1$
            66, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_20 = new TagInfo("c:get", //$NON-NLS-1$
            67, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_18 = new TagInfo("c:get", //$NON-NLS-1$
            68, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_19 = new TagInfo("c:get", //$NON-NLS-1$
            69, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_71_1 = new TagInfo("c:when", //$NON-NLS-1$
            71, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_13 = new TagInfo("c:get", //$NON-NLS-1$
            73, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_74_13 = new TagInfo("c:if", //$NON-NLS-1$
            74, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_74_62 = new TagInfo("c:setVariable", //$NON-NLS-1$
            74, 62,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_74_116 = new TagInfo("c:include", //$NON-NLS-1$
            74, 116,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_22 = new TagInfo("c:get", //$NON-NLS-1$
            76, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_13 = new TagInfo("c:get", //$NON-NLS-1$
            78, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_24 = new TagInfo("c:get", //$NON-NLS-1$
            79, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_38 = new TagInfo("c:get", //$NON-NLS-1$
            81, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_19 = new TagInfo("c:get", //$NON-NLS-1$
            82, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_68 = new TagInfo("c:get", //$NON-NLS-1$
            82, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_31 = new TagInfo("c:get", //$NON-NLS-1$
            84, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_20 = new TagInfo("c:get", //$NON-NLS-1$
            85, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_15 = new TagInfo("c:get", //$NON-NLS-1$
            86, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_5 = new TagInfo("c:get", //$NON-NLS-1$
            88, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_68 = new TagInfo("c:get", //$NON-NLS-1$
            88, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_121 = new TagInfo("c:get", //$NON-NLS-1$
            88, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_13 = new TagInfo("c:get", //$NON-NLS-1$
            90, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_68 = new TagInfo("c:get", //$NON-NLS-1$
            90, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_20 = new TagInfo("c:get", //$NON-NLS-1$
            91, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_33 = new TagInfo("c:get", //$NON-NLS-1$
            92, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_22 = new TagInfo("c:get", //$NON-NLS-1$
            93, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_19 = new TagInfo("c:get", //$NON-NLS-1$
            94, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_16 = new TagInfo("c:get", //$NON-NLS-1$
            96, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_71 = new TagInfo("c:get", //$NON-NLS-1$
            96, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_20 = new TagInfo("c:get", //$NON-NLS-1$
            97, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_29 = new TagInfo("c:get", //$NON-NLS-1$
            98, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_22 = new TagInfo("c:get", //$NON-NLS-1$
            99, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eOpposite/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_19 = new TagInfo("c:get", //$NON-NLS-1$
            100, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_103_1 = new TagInfo("c:when", //$NON-NLS-1$
            103, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_104_1 = new TagInfo("c:if", //$NON-NLS-1$
            104, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_105_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            105, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_106_7 = new TagInfo("c:include", //$NON-NLS-1$
            106, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_5 = new TagInfo("c:get", //$NON-NLS-1$
            108, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_111_1 = new TagInfo("c:when", //$NON-NLS-1$
            111, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_13 = new TagInfo("c:get", //$NON-NLS-1$
            113, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_68 = new TagInfo("c:get", //$NON-NLS-1$
            113, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_20 = new TagInfo("c:get", //$NON-NLS-1$
            114, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_18 = new TagInfo("c:get", //$NON-NLS-1$
            115, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_16 = new TagInfo("c:get", //$NON-NLS-1$
            117, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_71 = new TagInfo("c:get", //$NON-NLS-1$
            117, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_20 = new TagInfo("c:get", //$NON-NLS-1$
            118, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_18 = new TagInfo("c:get", //$NON-NLS-1$
            119, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_11 = new TagInfo("c:get", //$NON-NLS-1$
            123, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_userRegion_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_2_1.setRuntimeParent(null);
        _jettag_c_userRegion_2_1.setTagInfo(_td_c_userRegion_2_1);
        _jettag_c_userRegion_2_1.doStart(context, out);
        while (_jettag_c_userRegion_2_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_3_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_11.setRuntimeParent(_jettag_c_userRegion_2_1);
            _jettag_c_get_3_11.setTagInfo(_td_c_get_3_11);
            _jettag_c_get_3_11.doStart(context, out);
            _jettag_c_get_3_11.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_4_1.setRuntimeParent(_jettag_c_userRegion_2_1);
            _jettag_c_initialCode_4_1.setTagInfo(_td_c_initialCode_4_1);
            _jettag_c_initialCode_4_1.doStart(context, out);
            while (_jettag_c_initialCode_4_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_6_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_6_1.setRuntimeParent(_jettag_c_initialCode_4_1);
                _jettag_c_choose_6_1.setTagInfo(_td_c_choose_6_1);
                _jettag_c_choose_6_1.doStart(context, out);
                JET2Writer _jettag_c_choose_6_1_saved_out = out;
                while (_jettag_c_choose_6_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_7_1.setRuntimeParent(_jettag_c_choose_6_1);
                    _jettag_c_when_7_1.setTagInfo(_td_c_when_7_1);
                    _jettag_c_when_7_1.doStart(context, out);
                    JET2Writer _jettag_c_when_7_1_saved_out = out;
                    while (_jettag_c_when_7_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        // One-to-one (1..1) association. 
                        out.write("    def get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_9_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_9_13.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_9_13.setTagInfo(_td_c_get_9_13);
                        _jettag_c_get_9_13.doStart(context, out);
                        _jettag_c_get_9_13.doEnd();
                        out.write("(self):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        \"\"\" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_10_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_10_13.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_if_10_13.setTagInfo(_td_c_if_10_13);
                        _jettag_c_if_10_13.doStart(context, out);
                        while (_jettag_c_if_10_13.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_10_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_62); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_10_62.setRuntimeParent(_jettag_c_if_10_13);
                            _jettag_c_setVariable_10_62.setTagInfo(_td_c_setVariable_10_62);
                            _jettag_c_setVariable_10_62.doStart(context, out);
                            _jettag_c_setVariable_10_62.doEnd();
                            RuntimeTagElement _jettag_c_include_10_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_10_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_include_10_116.setRuntimeParent(_jettag_c_if_10_13);
                            _jettag_c_include_10_116.setTagInfo(_td_c_include_10_116);
                            _jettag_c_include_10_116.doStart(context, out);
                            _jettag_c_include_10_116.doEnd();
                            _jettag_c_if_10_13.handleBodyContent(out);
                        }
                        _jettag_c_if_10_13.doEnd();
                        out.write(NL);         
                        out.write("        \"\"\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        return self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_12_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_12_22.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_12_22.setTagInfo(_td_c_get_12_22);
                        _jettag_c_get_12_22.doStart(context, out);
                        _jettag_c_get_12_22.doEnd();
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_13.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_14_13.setTagInfo(_td_c_get_14_13);
                        _jettag_c_get_14_13.doStart(context, out);
                        _jettag_c_get_14_13.doEnd();
                        out.write("(self, value):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        if self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_15_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_15_18.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_15_18.setTagInfo(_td_c_get_15_18);
                        _jettag_c_get_15_18.doStart(context, out);
                        _jettag_c_get_15_18.doEnd();
                        out.write(" is not None:");  //$NON-NLS-1$        
                        out.write(NL);         
                        // Unset the old opposite reference. 
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_17_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_17_19.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_17_19.setTagInfo(_td_c_get_17_19);
                        _jettag_c_get_17_19.doStart(context, out);
                        _jettag_c_get_17_19.doEnd();
                        out.write("._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_17_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_17_68.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_17_68.setTagInfo(_td_c_get_17_68);
                        _jettag_c_get_17_68.doStart(context, out);
                        _jettag_c_get_17_68.doEnd();
                        out.write(" = None");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("        self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_19_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_15); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_19_15.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_19_15.setTagInfo(_td_c_get_19_15);
                        _jettag_c_get_19_15.doStart(context, out);
                        _jettag_c_get_19_15.doEnd();
                        out.write(" = value");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        if self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_20_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_20_18.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_20_18.setTagInfo(_td_c_get_20_18);
                        _jettag_c_get_20_18.doStart(context, out);
                        _jettag_c_get_20_18.doEnd();
                        out.write(" is not None:");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_21_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_21_19.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_21_19.setTagInfo(_td_c_get_21_19);
                        _jettag_c_get_21_19.doStart(context, out);
                        _jettag_c_get_21_19.doEnd();
                        out.write("._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_21_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_21_68.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_21_68.setTagInfo(_td_c_get_21_68);
                        _jettag_c_get_21_68.doStart(context, out);
                        _jettag_c_get_21_68.doEnd();
                        out.write(" = self");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_5.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_23_5.setTagInfo(_td_c_get_23_5);
                        _jettag_c_get_23_5.doStart(context, out);
                        _jettag_c_get_23_5.doEnd();
                        out.write(" = property(get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_68.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_23_68.setTagInfo(_td_c_get_23_68);
                        _jettag_c_get_23_68.doStart(context, out);
                        _jettag_c_get_23_68.doEnd();
                        out.write(", set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_121); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_121.setRuntimeParent(_jettag_c_when_7_1);
                        _jettag_c_get_23_121.setTagInfo(_td_c_get_23_121);
                        _jettag_c_get_23_121.doStart(context, out);
                        _jettag_c_get_23_121.doEnd();
                        out.write(")");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_7_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_7_1_saved_out;
                    _jettag_c_when_7_1.doEnd();
                    RuntimeTagElement _jettag_c_when_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_25_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_25_1.setRuntimeParent(_jettag_c_choose_6_1);
                    _jettag_c_when_25_1.setTagInfo(_td_c_when_25_1);
                    _jettag_c_when_25_1.doStart(context, out);
                    JET2Writer _jettag_c_when_25_1_saved_out = out;
                    while (_jettag_c_when_25_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        // One-to-many (1..n) association. 
                        out.write("    def get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_27_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_27_13.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_27_13.setTagInfo(_td_c_get_27_13);
                        _jettag_c_get_27_13.doStart(context, out);
                        _jettag_c_get_27_13.doEnd();
                        out.write("(self):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        \"\"\" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_28_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_28_13.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_if_28_13.setTagInfo(_td_c_if_28_13);
                        _jettag_c_if_28_13.doStart(context, out);
                        while (_jettag_c_if_28_13.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_28_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_62); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_28_62.setRuntimeParent(_jettag_c_if_28_13);
                            _jettag_c_setVariable_28_62.setTagInfo(_td_c_setVariable_28_62);
                            _jettag_c_setVariable_28_62.doStart(context, out);
                            _jettag_c_setVariable_28_62.doEnd();
                            RuntimeTagElement _jettag_c_include_28_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_28_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_include_28_116.setRuntimeParent(_jettag_c_if_28_13);
                            _jettag_c_include_28_116.setTagInfo(_td_c_include_28_116);
                            _jettag_c_include_28_116.doStart(context, out);
                            _jettag_c_include_28_116.doEnd();
                            _jettag_c_if_28_13.handleBodyContent(out);
                        }
                        _jettag_c_if_28_13.doEnd();
                        out.write(NL);         
                        out.write("        \"\"\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        return self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_30_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_30_22.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_30_22.setTagInfo(_td_c_get_30_22);
                        _jettag_c_get_30_22.doStart(context, out);
                        _jettag_c_get_30_22.doEnd();
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_32_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_32_13.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_32_13.setTagInfo(_td_c_get_32_13);
                        _jettag_c_get_32_13.doStart(context, out);
                        _jettag_c_get_32_13.doEnd();
                        out.write("(self, value):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        if self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_33_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_18.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_33_18.setTagInfo(_td_c_get_33_18);
                        _jettag_c_get_33_18.doStart(context, out);
                        _jettag_c_get_33_18.doEnd();
                        out.write(" is not None:");  //$NON-NLS-1$        
                        out.write(NL);         
                        // Remove self from old object's list. 
                        out.write("            filtered = [x for x in self.");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_35_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_41); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_35_41.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_35_41.setTagInfo(_td_c_get_35_41);
                        _jettag_c_get_35_41.doStart(context, out);
                        _jettag_c_get_35_41.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_35_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_89); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_35_89.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_35_89.setTagInfo(_td_c_get_35_89);
                        _jettag_c_get_35_89.doStart(context, out);
                        _jettag_c_get_35_89.doEnd();
                        out.write(" if x != self]");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_36_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_36_19.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_36_19.setTagInfo(_td_c_get_36_19);
                        _jettag_c_get_36_19.doStart(context, out);
                        _jettag_c_get_36_19.doEnd();
                        out.write("._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_36_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_36_68.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_36_68.setTagInfo(_td_c_get_36_68);
                        _jettag_c_get_36_68.doStart(context, out);
                        _jettag_c_get_36_68.doEnd();
                        out.write(" = filtered");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("        self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_38_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_15); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_38_15.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_38_15.setTagInfo(_td_c_get_38_15);
                        _jettag_c_get_38_15.doStart(context, out);
                        _jettag_c_get_38_15.doEnd();
                        out.write(" = value");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        if self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_39_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_39_18.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_39_18.setTagInfo(_td_c_get_39_18);
                        _jettag_c_get_39_18.doStart(context, out);
                        _jettag_c_get_39_18.doEnd();
                        out.write(" is not None:");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_40_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_40_19.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_40_19.setTagInfo(_td_c_get_40_19);
                        _jettag_c_get_40_19.doStart(context, out);
                        _jettag_c_get_40_19.doEnd();
                        out.write("._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_40_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_40_68.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_40_68.setTagInfo(_td_c_get_40_68);
                        _jettag_c_get_40_68.doStart(context, out);
                        _jettag_c_get_40_68.doEnd();
                        out.write(".append(self)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_42_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_5.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_42_5.setTagInfo(_td_c_get_42_5);
                        _jettag_c_get_42_5.doStart(context, out);
                        _jettag_c_get_42_5.doEnd();
                        out.write(" = property(get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_42_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_68.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_42_68.setTagInfo(_td_c_get_42_68);
                        _jettag_c_get_42_68.doStart(context, out);
                        _jettag_c_get_42_68.doEnd();
                        out.write(", set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_42_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_121); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_42_121.setRuntimeParent(_jettag_c_when_25_1);
                        _jettag_c_get_42_121.setTagInfo(_td_c_get_42_121);
                        _jettag_c_get_42_121.doStart(context, out);
                        _jettag_c_get_42_121.doEnd();
                        out.write(")");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_25_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_25_1_saved_out;
                    _jettag_c_when_25_1.doEnd();
                    RuntimeTagElement _jettag_c_when_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_44_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_44_1.setRuntimeParent(_jettag_c_choose_6_1);
                    _jettag_c_when_44_1.setTagInfo(_td_c_when_44_1);
                    _jettag_c_when_44_1.doStart(context, out);
                    JET2Writer _jettag_c_when_44_1_saved_out = out;
                    while (_jettag_c_when_44_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        // Many-to-one (n..1) association. 
                        out.write("    def get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_46_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_46_13.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_46_13.setTagInfo(_td_c_get_46_13);
                        _jettag_c_get_46_13.doStart(context, out);
                        _jettag_c_get_46_13.doEnd();
                        out.write("(self):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        \"\"\" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_47_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_47_13.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_if_47_13.setTagInfo(_td_c_if_47_13);
                        _jettag_c_if_47_13.doStart(context, out);
                        while (_jettag_c_if_47_13.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_47_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_47_62); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_47_62.setRuntimeParent(_jettag_c_if_47_13);
                            _jettag_c_setVariable_47_62.setTagInfo(_td_c_setVariable_47_62);
                            _jettag_c_setVariable_47_62.doStart(context, out);
                            _jettag_c_setVariable_47_62.doEnd();
                            RuntimeTagElement _jettag_c_include_47_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_47_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_include_47_116.setRuntimeParent(_jettag_c_if_47_13);
                            _jettag_c_include_47_116.setTagInfo(_td_c_include_47_116);
                            _jettag_c_include_47_116.doStart(context, out);
                            _jettag_c_include_47_116.doEnd();
                            _jettag_c_if_47_13.handleBodyContent(out);
                        }
                        _jettag_c_if_47_13.doEnd();
                        out.write(NL);         
                        out.write("        \"\"\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        return self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_49_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_49_22.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_49_22.setTagInfo(_td_c_get_49_22);
                        _jettag_c_get_49_22.doStart(context, out);
                        _jettag_c_get_49_22.doEnd();
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_51_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_51_13.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_51_13.setTagInfo(_td_c_get_51_13);
                        _jettag_c_get_51_13.doStart(context, out);
                        _jettag_c_get_51_13.doEnd();
                        out.write("(self, value):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for x in self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_52_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_24); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_52_24.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_52_24.setTagInfo(_td_c_get_52_24);
                        _jettag_c_get_52_24.doStart(context, out);
                        _jettag_c_get_52_24.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        // Unset the old oppopsite references. 
                        out.write("            x._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_54_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_16); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_54_16.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_54_16.setTagInfo(_td_c_get_54_16);
                        _jettag_c_get_54_16.doStart(context, out);
                        _jettag_c_get_54_16.doEnd();
                        out.write(" = None");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for y in value:");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            y._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_56_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_16); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_56_16.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_56_16.setTagInfo(_td_c_get_56_16);
                        _jettag_c_get_56_16.doStart(context, out);
                        _jettag_c_get_56_16.doEnd();
                        out.write(" = self");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_57_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_15); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_57_15.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_57_15.setTagInfo(_td_c_get_57_15);
                        _jettag_c_get_57_15.doStart(context, out);
                        _jettag_c_get_57_15.doEnd();
                        out.write(" = value");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_59_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_59_5.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_59_5.setTagInfo(_td_c_get_59_5);
                        _jettag_c_get_59_5.doStart(context, out);
                        _jettag_c_get_59_5.doEnd();
                        out.write(" = property(get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_59_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_59_68.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_59_68.setTagInfo(_td_c_get_59_68);
                        _jettag_c_get_59_68.doStart(context, out);
                        _jettag_c_get_59_68.doEnd();
                        out.write(", set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_59_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_121); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_59_121.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_59_121.setTagInfo(_td_c_get_59_121);
                        _jettag_c_get_59_121.doStart(context, out);
                        _jettag_c_get_59_121.doEnd();
                        out.write(")");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def add_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_61_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_61_13.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_61_13.setTagInfo(_td_c_get_61_13);
                        _jettag_c_get_61_13.doStart(context, out);
                        _jettag_c_get_61_13.doEnd();
                        out.write("(self, *");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_61_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_61_68.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_61_68.setTagInfo(_td_c_get_61_68);
                        _jettag_c_get_61_68.doStart(context, out);
                        _jettag_c_get_61_68.doEnd();
                        out.write("):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for obj in ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_62_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_62_20.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_62_20.setTagInfo(_td_c_get_62_20);
                        _jettag_c_get_62_20.doStart(context, out);
                        _jettag_c_get_62_20.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            obj._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_63_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_63_18.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_63_18.setTagInfo(_td_c_get_63_18);
                        _jettag_c_get_63_18.doStart(context, out);
                        _jettag_c_get_63_18.doEnd();
                        out.write(" = self");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_64_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_64_19.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_64_19.setTagInfo(_td_c_get_64_19);
                        _jettag_c_get_64_19.doStart(context, out);
                        _jettag_c_get_64_19.doEnd();
                        out.write(".append(obj)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def remove_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_66_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_16); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_66_16.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_66_16.setTagInfo(_td_c_get_66_16);
                        _jettag_c_get_66_16.doStart(context, out);
                        _jettag_c_get_66_16.doEnd();
                        out.write("(self, *");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_66_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_71); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_66_71.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_66_71.setTagInfo(_td_c_get_66_71);
                        _jettag_c_get_66_71.doStart(context, out);
                        _jettag_c_get_66_71.doEnd();
                        out.write("):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for obj in ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_67_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_67_20.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_67_20.setTagInfo(_td_c_get_67_20);
                        _jettag_c_get_67_20.doStart(context, out);
                        _jettag_c_get_67_20.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            obj._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_68_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_68_18.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_68_18.setTagInfo(_td_c_get_68_18);
                        _jettag_c_get_68_18.doStart(context, out);
                        _jettag_c_get_68_18.doEnd();
                        out.write(" = None");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_69_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_69_19.setRuntimeParent(_jettag_c_when_44_1);
                        _jettag_c_get_69_19.setTagInfo(_td_c_get_69_19);
                        _jettag_c_get_69_19.doStart(context, out);
                        _jettag_c_get_69_19.doEnd();
                        out.write(".remove(obj)");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_44_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_44_1_saved_out;
                    _jettag_c_when_44_1.doEnd();
                    RuntimeTagElement _jettag_c_when_71_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_71_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_71_1.setRuntimeParent(_jettag_c_choose_6_1);
                    _jettag_c_when_71_1.setTagInfo(_td_c_when_71_1);
                    _jettag_c_when_71_1.doStart(context, out);
                    JET2Writer _jettag_c_when_71_1_saved_out = out;
                    while (_jettag_c_when_71_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        // Many-to-many (n..n) association. 
                        out.write("    def get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_73_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_73_13.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_73_13.setTagInfo(_td_c_get_73_13);
                        _jettag_c_get_73_13.doStart(context, out);
                        _jettag_c_get_73_13.doEnd();
                        out.write("(self):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        \"\"\" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_if_74_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_74_13.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_if_74_13.setTagInfo(_td_c_if_74_13);
                        _jettag_c_if_74_13.doStart(context, out);
                        while (_jettag_c_if_74_13.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_74_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_74_62); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_74_62.setRuntimeParent(_jettag_c_if_74_13);
                            _jettag_c_setVariable_74_62.setTagInfo(_td_c_setVariable_74_62);
                            _jettag_c_setVariable_74_62.doStart(context, out);
                            _jettag_c_setVariable_74_62.doEnd();
                            RuntimeTagElement _jettag_c_include_74_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_74_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_include_74_116.setRuntimeParent(_jettag_c_if_74_13);
                            _jettag_c_include_74_116.setTagInfo(_td_c_include_74_116);
                            _jettag_c_include_74_116.doStart(context, out);
                            _jettag_c_include_74_116.doEnd();
                            _jettag_c_if_74_13.handleBodyContent(out);
                        }
                        _jettag_c_if_74_13.doEnd();
                        out.write(NL);         
                        out.write("        \"\"\"");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        return self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_76_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_76_22.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_76_22.setTagInfo(_td_c_get_76_22);
                        _jettag_c_get_76_22.doStart(context, out);
                        _jettag_c_get_76_22.doEnd();
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_78_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_78_13.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_78_13.setTagInfo(_td_c_get_78_13);
                        _jettag_c_get_78_13.doStart(context, out);
                        _jettag_c_get_78_13.doEnd();
                        out.write("(self, value):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for p in self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_79_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_24); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_79_24.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_79_24.setTagInfo(_td_c_get_79_24);
                        _jettag_c_get_79_24.doStart(context, out);
                        _jettag_c_get_79_24.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        // Unset the old oppopsite references. 
                        out.write("            filtered = [q for q in p.");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_81_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_38); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_81_38.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_81_38.setTagInfo(_td_c_get_81_38);
                        _jettag_c_get_81_38.doStart(context, out);
                        _jettag_c_get_81_38.doEnd();
                        out.write(" if q != self]");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_82_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_82_19.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_82_19.setTagInfo(_td_c_get_82_19);
                        _jettag_c_get_82_19.doStart(context, out);
                        _jettag_c_get_82_19.doEnd();
                        out.write("._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_82_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_82_68.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_82_68.setTagInfo(_td_c_get_82_68);
                        _jettag_c_get_82_68.doStart(context, out);
                        _jettag_c_get_82_68.doEnd();
                        out.write(" = filtered");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for r in value:");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            if self not in r._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_84_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_31); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_84_31.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_84_31.setTagInfo(_td_c_get_84_31);
                        _jettag_c_get_84_31.doStart(context, out);
                        _jettag_c_get_84_31.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("                r._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_85_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_85_20.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_85_20.setTagInfo(_td_c_get_85_20);
                        _jettag_c_get_85_20.doStart(context, out);
                        _jettag_c_get_85_20.doEnd();
                        out.write(".append(self)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_86_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_15); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_86_15.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_86_15.setTagInfo(_td_c_get_86_15);
                        _jettag_c_get_86_15.doStart(context, out);
                        _jettag_c_get_86_15.doEnd();
                        out.write(" = value");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_88_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_88_5.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_88_5.setTagInfo(_td_c_get_88_5);
                        _jettag_c_get_88_5.doStart(context, out);
                        _jettag_c_get_88_5.doEnd();
                        out.write(" = property(get_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_88_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_88_68.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_88_68.setTagInfo(_td_c_get_88_68);
                        _jettag_c_get_88_68.doStart(context, out);
                        _jettag_c_get_88_68.doEnd();
                        out.write(", set_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_88_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_121); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_88_121.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_88_121.setTagInfo(_td_c_get_88_121);
                        _jettag_c_get_88_121.doStart(context, out);
                        _jettag_c_get_88_121.doEnd();
                        out.write(")");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def add_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_90_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_90_13.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_90_13.setTagInfo(_td_c_get_90_13);
                        _jettag_c_get_90_13.doStart(context, out);
                        _jettag_c_get_90_13.doEnd();
                        out.write("(self, *");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_90_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_90_68.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_90_68.setTagInfo(_td_c_get_90_68);
                        _jettag_c_get_90_68.doStart(context, out);
                        _jettag_c_get_90_68.doEnd();
                        out.write("):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for obj in ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_91_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_91_20.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_91_20.setTagInfo(_td_c_get_91_20);
                        _jettag_c_get_91_20.doStart(context, out);
                        _jettag_c_get_91_20.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            if self not in obj._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_92_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_33); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_92_33.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_92_33.setTagInfo(_td_c_get_92_33);
                        _jettag_c_get_92_33.doStart(context, out);
                        _jettag_c_get_92_33.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("                obj._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_93_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_93_22.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_93_22.setTagInfo(_td_c_get_93_22);
                        _jettag_c_get_93_22.doStart(context, out);
                        _jettag_c_get_93_22.doEnd();
                        out.write(".append(self)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_94_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_94_19.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_94_19.setTagInfo(_td_c_get_94_19);
                        _jettag_c_get_94_19.doStart(context, out);
                        _jettag_c_get_94_19.doEnd();
                        out.write(".append(obj)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def remove_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_96_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_16); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_96_16.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_96_16.setTagInfo(_td_c_get_96_16);
                        _jettag_c_get_96_16.doStart(context, out);
                        _jettag_c_get_96_16.doEnd();
                        out.write("(self, *");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_96_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_71); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_96_71.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_96_71.setTagInfo(_td_c_get_96_71);
                        _jettag_c_get_96_71.doStart(context, out);
                        _jettag_c_get_96_71.doEnd();
                        out.write("):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for obj in ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_97_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_97_20.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_97_20.setTagInfo(_td_c_get_97_20);
                        _jettag_c_get_97_20.doStart(context, out);
                        _jettag_c_get_97_20.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            if self in obj._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_98_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_29); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_98_29.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_98_29.setTagInfo(_td_c_get_98_29);
                        _jettag_c_get_98_29.doStart(context, out);
                        _jettag_c_get_98_29.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("                obj._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_99_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_22); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_99_22.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_99_22.setTagInfo(_td_c_get_99_22);
                        _jettag_c_get_99_22.doStart(context, out);
                        _jettag_c_get_99_22.doEnd();
                        out.write(".remove(self)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self._");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_100_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_19); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_100_19.setRuntimeParent(_jettag_c_when_71_1);
                        _jettag_c_get_100_19.setTagInfo(_td_c_get_100_19);
                        _jettag_c_get_100_19.doStart(context, out);
                        _jettag_c_get_100_19.doEnd();
                        out.write(".remove(obj)");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_71_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_71_1_saved_out;
                    _jettag_c_when_71_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_103_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_103_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_103_1.setRuntimeParent(_jettag_c_choose_6_1);
                    _jettag_c_when_103_1.setTagInfo(_td_c_when_103_1);
                    _jettag_c_when_103_1.doStart(context, out);
                    JET2Writer _jettag_c_when_103_1_saved_out = out;
                    while (_jettag_c_when_103_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_if_104_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_104_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_104_1.setRuntimeParent(_jettag_c_when_103_1);
                        _jettag_c_if_104_1.setTagInfo(_td_c_if_104_1);
                        _jettag_c_if_104_1.doStart(context, out);
                        while (_jettag_c_if_104_1.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_105_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_105_5); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_105_5.setRuntimeParent(_jettag_c_if_104_1);
                            _jettag_c_setVariable_105_5.setTagInfo(_td_c_setVariable_105_5);
                            _jettag_c_setVariable_105_5.doStart(context, out);
                            _jettag_c_setVariable_105_5.doEnd();
                            out.write("    # ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_include_106_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_106_7); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_include_106_7.setRuntimeParent(_jettag_c_if_104_1);
                            _jettag_c_include_106_7.setTagInfo(_td_c_include_106_7);
                            _jettag_c_include_106_7.doStart(context, out);
                            _jettag_c_include_106_7.doEnd();
                            out.write(NL);         
                            _jettag_c_if_104_1.handleBodyContent(out);
                        }
                        _jettag_c_if_104_1.doEnd();
                        out.write("    ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_108_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_108_5.setRuntimeParent(_jettag_c_when_103_1);
                        _jettag_c_get_108_5.setTagInfo(_td_c_get_108_5);
                        _jettag_c_get_108_5.doStart(context, out);
                        _jettag_c_get_108_5.doEnd();
                        out.write(" = None");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_103_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_103_1_saved_out;
                    _jettag_c_when_103_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_111_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_111_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_111_1.setRuntimeParent(_jettag_c_choose_6_1);
                    _jettag_c_when_111_1.setTagInfo(_td_c_when_111_1);
                    _jettag_c_when_111_1.doStart(context, out);
                    JET2Writer _jettag_c_when_111_1_saved_out = out;
                    while (_jettag_c_when_111_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        // Provide 'add' and 'remove' methods for consistency. 
                        out.write("    def add_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_113_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_13); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_113_13.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_113_13.setTagInfo(_td_c_get_113_13);
                        _jettag_c_get_113_13.doStart(context, out);
                        _jettag_c_get_113_13.doEnd();
                        out.write("(self, *");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_113_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_113_68.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_113_68.setTagInfo(_td_c_get_113_68);
                        _jettag_c_get_113_68.doStart(context, out);
                        _jettag_c_get_113_68.doEnd();
                        out.write("):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for obj in ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_114_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_114_20.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_114_20.setTagInfo(_td_c_get_114_20);
                        _jettag_c_get_114_20.doStart(context, out);
                        _jettag_c_get_114_20.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self.");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_115_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_115_18.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_115_18.setTagInfo(_td_c_get_115_18);
                        _jettag_c_get_115_18.doStart(context, out);
                        _jettag_c_get_115_18.doEnd();
                        out.write(".append(obj)");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write(NL);         
                        out.write("    def remove_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_117_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_16); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_117_16.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_117_16.setTagInfo(_td_c_get_117_16);
                        _jettag_c_get_117_16.doStart(context, out);
                        _jettag_c_get_117_16.doEnd();
                        out.write("(self, *");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_117_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_71); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_117_71.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_117_71.setTagInfo(_td_c_get_117_71);
                        _jettag_c_get_117_71.doStart(context, out);
                        _jettag_c_get_117_71.doEnd();
                        out.write("):");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("        for obj in ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_118_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_20); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_118_20.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_118_20.setTagInfo(_td_c_get_118_20);
                        _jettag_c_get_118_20.doStart(context, out);
                        _jettag_c_get_118_20.doEnd();
                        out.write(":");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("            self.");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_119_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_18); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_119_18.setRuntimeParent(_jettag_c_when_111_1);
                        _jettag_c_get_119_18.setTagInfo(_td_c_get_119_18);
                        _jettag_c_get_119_18.doStart(context, out);
                        _jettag_c_get_119_18.doEnd();
                        out.write(".remove(obj)");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_111_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_111_1_saved_out;
                    _jettag_c_when_111_1.doEnd();
                    _jettag_c_choose_6_1.handleBodyContent(out);
                }
                out = _jettag_c_choose_6_1_saved_out;
                _jettag_c_choose_6_1.doEnd();
                _jettag_c_initialCode_4_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_4_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_123_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_123_11.setRuntimeParent(_jettag_c_userRegion_2_1);
            _jettag_c_get_123_11.setTagInfo(_td_c_get_123_11);
            _jettag_c_get_123_11.doStart(context, out);
            _jettag_c_get_123_11.doEnd();
            out.write(NL);         
            _jettag_c_userRegion_2_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_2_1.doEnd();
    }
}
