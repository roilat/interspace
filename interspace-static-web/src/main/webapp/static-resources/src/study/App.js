import React, { Component } from 'react';
import logo from './logo.png';
import './App.css';
import './data/head_list.json';


class Header extends Component{
	constructor(props){
		super(props);
		var str = props.header.map((item)=>{
			<li><a href={item.page}>{item.title}</a></li>
		});
		this.state = {headStr:str};
	}
	render(){
		return (<ul>
			{this.state.str}
		</ul>)
	}
}
class App extends Component {
  render() {
    return (<Header />);
  }
}



export default App;
