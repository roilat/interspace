import React from 'react';
import headerList from '../data/menuList.json';

class Header extends React.Component{
	constructor(props){
		super(props);
		var str = headerList.map((item,i)=>{
			return (<li key={i}><a href={item.page} onClick={this.doOnClick} className={window.location.href.indexOf(item.page)>=0?"selected":""}>{item.title}</a></li>)
		});
		this.state = {headStr:str};
	}
	doOnClick(e){
		if(!e.target.href.endsWith('/index.html')){
			alert("功能暂未开放，敬请期待！");
			e.preventDefault();
		}
	}
	render(){
		return (<div><div className="logo"><a href="/"><img alt="" src="images/logo.png"></img></a></div><nav id="nav"><ul>
			{this.state.headStr}
		</ul></nav></div>)
	}
}
export default Header;
