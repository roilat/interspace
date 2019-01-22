import Body from './common/Body';
import React from 'react';
import $ from 'jquery';

class Home extends Body{
	render(){
		return (<div>
			<HomeLeft />
			<HomeRight source={"mock_data/home_content_list.json?t="+new Date().getTime()} />
		</div>);
	}
}
class HomeLeft extends React.Component{
	render(){
		return (<div className="l_box">
			<HomeAboutMe />
			<HomeMyPhotos />
			<HomeSearch />
			<BlogClassify />
			<BlogElite />
			<FollowMe />
		</div>);
	}
}
class HomeAboutMe extends React.Component{
	render(){
		return (<div id="aboutMe" className="about_me"><h2>关于我</h2>
	      <ul>
	        <i><img src="images/owner.jpg" alt=""></img></i>
	        <p><b>临界之间</b>，一个80后程序猿一名。</p>
	      </ul></div>);
	}
}
class HomeMyPhotos extends React.Component{
	render(){
		return (<div className="wdxc"><h2>我的相册</h2>
	      <ul>
	        <li><a href="/"><img src="images_1/7.jpg" alt=""></img></a></li>
	        <li><a href="/"><img src="images_1/8.jpg" alt=""></img></a></li>
	        <li><a href="/"><img src="images_1/9.jpg" alt=""></img></a></li>
	        <li><a href="/"><img src="images_1/10.jpg" alt=""></img></a></li>
	        <li><a href="/"><img src="images_1/11.jpg" alt=""></img></a></li>
	        <li><a href="/"><img src="images_1/12.jpg" alt=""></img></a></li>
	      </ul></div>);
	}
}
class HomeSearch extends React.Component{
	  constructor(props) {
	      super(props);
	      this.state = {html: '123'};
	  }
	render(){
		var inputText = {color: "rgb(153, 153, 153)"};
		return (<div className="search">
	      <form action="" method="post" name="searchform" id="searchform">
	        <input name="keyboard" id="keyboard" className="input_text" style={inputText} placeholder="请输入关键字词" type="text" />
	        <input name="show" value="title" type="hidden" />
	        <input name="tempid" value="1" type="hidden" />
	        <input name="tbname" value="news" type="hidden" />
	        <input name="Submit" className="input_submit" value="搜索" type="submit" />
	      </form>
	    </div>);
	}
}
class BlogClassify extends React.Component{
	render(){
		return (<div className="fenlei">
	      <h2>文章分类</h2>
	      <ul>
	        <li><a href="/">学无止境（33）</a></li>
	        <li><a href="/">日记（19）</a></li>
	        <li><a href="/">慢生活（520）</a></li>
	        <li><a href="/">美文欣赏（40）</a></li>
	      </ul>
	    </div>);
	}
}
class BlogElite extends React.Component{
	render(){
		return (<div className="tuijian">
	      <h2>站长推荐</h2>
	      <ul>
	        <li><a href="/">你是什么人便会遇上什么人</a></li>
	        <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
	        <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
	        <li><a href="/">个人博客模板《绅士》后台管理</a></li>
	        <li><a href="/">你是什么人便会遇上什么人</a></li>
	        <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
	        <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
	        <li><a href="/">个人博客模板《绅士》后台管理</a></li>
	      </ul>
	    </div>);
	}
}

class Blogroll extends React.Component{
	render(){
		return (<div className="links">
	      <h2>友情链接</h2>
	      <ul>
	        <a href="http://www.roilat.cn">临界之间个人博客</a> <a href="http://www.roilat.cn">临界之间博客</a>
	      </ul>
	    </div>);
	}
}
class FollowMe extends React.Component{
	render(){
		return (<div className="guanzhu">
	      <h2>关注我我的微信公众号</h2>
	      <ul>
	        <img src="images/gzh_qrcode.jpg" alt=""></img>
	      </ul>
	    </div>);
	}
}
class HomeRight extends React.Component{
	  constructor(props) {
	      super(props);
	      this.state = {data: []};
	  }
	  componentDidMount() {
        this.serverRequest = $.ajax({
            url: this.props.source, 
            type:"GET",
            dataType: 'json',
            success: function (result) {
		    	this.setState({"data":result});
            }.bind(this),
            error:function(xhr,e,er){
            	console.log(xhr,e,er);
            }
        })
	  }
		 
	  componentWillUnmount() {
	    this.serverRequest.abort();
	  }	
	render(){
		return (<div className="r_box">
		{
			this.state.data.map(function(item){
    			return  (<li><a href="/"><i><img src={item.img} alt=""></img></i>
    		      <h3>{item.title}</h3>
    		      <p>{item.content}</p></a>
    		    </li>);
    		})
		}
		</div>);
	}
}

export default Home;
