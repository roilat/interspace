import React, { Component } from 'react';
import headerList from '../data/menuList.json';

class Header extends Component{
	constructor(props){
		super(props);
		var str = headerList.map((item)=>{
			return (<li><a href={item.page} className={window.location.href.indexOf(item.page)>=0?"selected":""}>{item.title}</a></li>)
		});
		this.state = {headStr:str};
	}
	render(){
		return (<ul>
			{this.state.headStr}
		</ul>)
	}
}
export default Header;
