package vue;

/*						Vue详解
	
	1.VueJS介绍
		1.Vue.js是一个构建数据驱动的 web 界面的渐进式框架。Vue.js 的目标是通过尽可能简单的 API 实现响应的数据绑
		  定和组合的视图组件。它不仅易于上手，还便于与第三方库或既有项目整合。
		  
		2.官网:https://cn.vuejs.org/

	2.MVVM模式
		1.MVVM是Model-View-ViewModel的简写。它本质上就是MVC 的改进版。MVVM 就是将其中的View 的状态和行为
		抽象化，让我们将视图 UI 和业务逻辑分开。
		
		2.MVVM模式和MVC模式一样，主要目的是分离视图（View）和模型（Model）

		3.Vue.js 是一个提供了 MVVM 风格的双向数据绑定的 Javascript 库，专注于View 层。它的核心是 MVVM 中的 VM，
		也就是 ViewModel。 ViewModel负责连接 View 和 Model，保证视图和数据的一致性，这种轻量级的架构让前端
		开发更加高效、便捷


	3.Vue的使用
		1.script：引入vue.js文件
		2.script：	1.创建 Vue 的实例，绑定标签、数据(model)、方法、钩子函数		--注意：创建 Vue 对象，首字母要大写！
						1. Vue中 this：代表 Vue的实例。
		
		3.html：		1.使用 插值表达式 展示 model中数据：	{{num}}					--弊端：网速差时会出现插值闪烁，因为script代码加载完才显示
					 .使用 v-text 指令 展示text数据：	<span v-text="name"></span>
					 .使用 v-html 指令 展示html数据：	<span v-html="word"></span>
					 
					2.使用 v-model 指令，双向绑定 model：	
						<input type="text" v-model="name">				--用户可输入的标签都可以使用该指令
					
					3.使用 @事件(v-on:事件) 指令---标签中事件绑定 JS表达式或函数:	
						<button @click="num++">+</button>				--绑定JS表达式，'@事件' 是 'v-on:事件' 的简化写法.
						<button @click="sayhi('都好')">打招呼</button>	--绑定函数
						
					4.使用 @事件.stop 指令---阻止事件冒泡(事件发生后，从里向外传播)：
						<button @click.stop="click('button')">点击按钮</button>

					 .使用 @事件.prevent 指令---阻止默认事件发生(如跳转)：
						<a href="http://www.baidu.com" @click.prevent="click('百度')">百度</a>
				
			例:		<script>
						new Vue({
							el : "#app",
							data : {
								name : "vue",
								num : 1,
								message : "你们好！",
								word : "<h1>世界和平</h1>"
							},
							methods : {
								sayhi : function(msg){
									this.message=msg;
								}
							},
							created: function() {
								console.log("Vue实例创建了");
							},
						});
					</script>
	
	4.Vue生命周期
		1.Vue 实例初始化过程：创建实例(created)，装载模板(mounted)，渲染模板(updated)等。
		
		2.Vue为生命周期中的每个状态都设置了钩子函数（监听函数），Vue实例 处于不同时期时，对应的函数就会触发。(比如：在Vue中定义一个created函数)
			beforeCreate, created, beforeMount, mounted, beforeUpdate, updated, beforeDestroy, destroyed
			
		
 */

public class Vue详解 {

}
