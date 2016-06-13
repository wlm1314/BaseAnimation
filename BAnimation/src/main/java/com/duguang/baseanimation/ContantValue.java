package com.duguang.baseanimation;

import com.duguang.baseanimation.R;
import com.duguang.baseanimation.R.anim;

/**
 * 常量页面
 * 
 * @author duguang 博客地址:http://blog.csdn.net/duguang77
 */
public interface ContantValue {

	// ---------------------------Main页面------------------------------------
	String[] mainItem = { "简单动画", "复杂动画", "Splash引导动画", "Flip效果合集(折叠)",
			"NineOld", "Property效果","高仿动画效果","Listview效果集合","自定义控件效果集合","页面滑动切换效果集合" };
	
	
	// ---------------------------简单动画页面------------------------------------

	int[] simple = { anim.a1, anim.a2, anim.alpha, anim.alpha_rotate,
			anim.alpha_scale, anim.alpha_scale_rotate,
			anim.alpha_scale_translate, anim.alpha_scale_translate_rotate,
			anim.alpha_translate, anim.alpha_translate_rotate,
			anim.drawroll_ani_in, anim.drawroll_ani_out, anim.fade,
			anim.gallery_in, anim.hold, anim.hyperspace_in,
			anim.hyperspace_out, anim.left_in, anim.left_out,
			anim.my_alpha_action, anim.my_scale_action,
			anim.myanimation_set, anim.myown_design, anim.push_left_in,
			anim.push_left_out, anim.push_up_in, anim.push_up_out,
			anim.right_in, anim.right_out, anim.rotate, anim.scale,
			anim.scale_rotate, anim.scale_translate,
			anim.scale_translate_rotate, anim.slide_down_out,
			anim.slide_left, anim.slide_right, anim.slide_up_in,
			anim.translate, anim.translate_rotate, anim.wave_scale,
			anim.zoom_enter, anim.zoom_exit };

	String[] simpleName = { "a1", "a2", "alpha", "alpha_rotate", "alpha_scale",
			"alpha_scale_rotate", "alpha_scale_translate",
			"alpha_scale_translate_rotate", "alpha_translate",
			"alpha_translate_rotate", "drawroll_ani_in", "drawroll_ani_out",
			"fade", "gallery_in", "hold", "hyperspace_in", "hyperspace_out",
			"left_in", "left_out", "my_alpha_action", "my_scale_action",
			"myanimation_set", "myown_design", "push_left_in", "push_left_out",
			"push_up_in", "push_up_out", "right_in", "right_out", "rotate",
			"scale", "scale_rotate", "scale_translate",
			"scale_translate_rotate", "slide_down_out", "slide_left",
			"slide_right", "slide_up_in", "translate", "translate_rotate",
			"wave_scale", "zoom_enter", "zoom_exit" };

	// ---------------------------复杂动画页面------------------------------------

	int[] complex = { anim.block_move_right, anim.grow_from_top,
			anim.in_scale_x, anim.in_translate_top,
			anim.out_translate_top, anim.refreshable_list_rotate,
			anim.shrink_from_bottom, anim.small_2_big,
			anim.appear_bottom_right_in, anim.appear_bottom_right_out,
			anim.appear_top_left_in, anim.appear_top_left_out,
			anim.disappear_bottom_right_in,
			anim.disappear_bottom_right_out, anim.disappear_top_left_in,
			anim.disappear_top_left_out, anim.fade_in, anim.fade_out,
			anim.flip_horizontal_in, anim.flip_horizontal_out,
			anim.flip_vertical_in, anim.flip_vertical_out,
			anim.unzoom_in, anim.unzoom_out };

	String[] animName = { "block_move_right", "grow_from_top", "in_scale_x",
			"in_translate_top", "out_translate_top", "refreshable_list_rotate",
			"shrink_from_bottom", "small_2_big", "appear_bottom_right_in",
			"appear_bottom_right_out", "appear_top_left_in",
			"appear_top_left_out", "disappear_bottom_right_in",
			"disappear_bottom_right_out", "disappear_top_left_in",
			"disappear_top_left_out", "fade_in", "fade_out",
			"flip_horizontal_in", "flip_horizontal_out", "flip_vertical_in",
			"flip_vertical_out", "unzoom_in", "unzoom_out" };

	
	// ---------------------------SplashMain页面------------------------------------
	String[] splashName = { "Zaker风格", "镜头风格_由远至近", "硬币翻转风格","3D翻转效果","Viewpager引导风格","中心打开式",
			"ShowTime2秒式","ShowTime2秒式(第二种实现方法)" };
	
	// ---------------------------Imitate高仿效果页面------------------------------------
	String[] imitateName = { "火车票出票动画", "淘宝菜单", "优酷导航菜单","3D图片浏览","下拉选择框",
			"腾讯,360安全雷达效果","计算器","温度表盘效果","瀑布流效果","高仿360首页","滚轮效果_时间And地方","浮动在首页的小插件效果",
			"仿微信页面","模拟心跳","上拉抽屉样式","淘宝菜单2"};
	
	// ---------------------------ListView页面------------------------------------
	String[] listViewName = { "上下拉刷新的ListView", "滑动删除条目的ListView", "通讯录效果一ListView","通讯录效果二ListView",
			"左侧按钮删除条目ListView","渐变后删除条目ListView","GoogleCardsListView效果","GridView效果","AppearanceListView效果"
			,"Drag And Drop效果","Swipe to Dismiss效果","Animate Dismiss效果","Expand listItems效果","ListView中的item随意拖动",
			"翻译效果的ListView"};

	// ---------------------------自定义控件合集Main页面------------------------------------
		String[] customName = { "自定义FramLayout文字飞入飞出效果", "在任意控件上增加带数字的气泡效果","圆形旋转菜单(自定义Layout+ImageView)",
								"ListView循环更换标题效果","自定义Gallery+ListView效果","自定义LinearLayout侧边栏效果",
								"自定义横向ScrollView","自定义ProgressBar(4种样式)","自定义加载LodingDialog样式","自定义PopWindow",
								"多种DiaLog大集合","Y轴旋转切换图片(自定义Relayout)","菜单式PopWindow","自定义的ImageView效果",
								"ViewPager+ScrollView+ListView效果","自定义滑动开关按钮","仿小米启动效果"};
	
	// ---------------------------SplashMain页面------------------------------------
		String[] tabName = { "ViewPager实现页面滑动切换","横向ScrollView+Viewpager滑动切换","ViewPager+GridView滑动切换","横向拖动TabHost" };
}
