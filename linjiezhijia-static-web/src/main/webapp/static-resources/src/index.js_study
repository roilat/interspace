import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';


// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
class Clock extends React.Component {
	  constructor(props) {
	    super(props);
	    this.state = {date: new Date()};
	  }
	 
	  componentDidMount() {
	    this.timerID = setInterval(
	      () => this.tick(),
	      1000
	    );
	  }
	 
	  componentWillUnmount() {
	    clearInterval(this.timerID);
	  }
	 
	  tick() {
	    this.setState({
	      date: new Date()
	    });
	  }
	 
	  render() {
	    return (
	      <div>
	        <h1>Hello, world!</h1>
	        <h2>现在是 {this.state.date.toLocaleTimeString()}.</h2>
	      </div>
	    );
	  }
	}
function ActionLink() {
	  function handleClick(e) {
	    e.preventDefault();
	    console.log('链接被点击');
	  }
	 
	  return (
	    <a href="#" onClick={handleClick}>
	      点我
	    </a>
	  );
	}
class Toggle extends React.Component {
	  constructor(props) {
	    super(props);
	    this.state = {isToggleOn: true};
	 
	    // 这边绑定是必要的，这样 `this` 才能在回调函数中使用
	    this.handleClick = this.handleClick.bind(this);
	  }
	 
	  handleClick() {
	    this.setState(prevState => ({
	      isToggleOn: !prevState.isToggleOn
	    }));
	  }
	 
	  render() {
	    return (
	      <button onClick={this.handleClick}>
	        {this.state.isToggleOn ? 'ON' : 'OFF'}
	      </button>
	    );
	  }
	}
function UserGreeting(props) {
	  return <h1>欢迎回来!</h1>;
	}

	function GuestGreeting(props) {
	  return <h1>请先注册。</h1>;
	}
function Greeting(props) {
	  const isLoggedIn = props.isLoggedIn;
	  if (isLoggedIn) {
	    return <UserGreeting />;
	  }
	  return <GuestGreeting />;
	}
class LogoutButton extends React.Component {

	render() {
		return <button onClick={this.props.onClick}>退出</button>;
	}
}
class LoginButton extends React.Component {
	render() {
		return <button onClick={this.props.onClick}>登录</button>;
	}
}
class LoginControl extends React.Component {
	  constructor(props) {
	    super(props);
	    this.handleLoginClick = this.handleLoginClick.bind(this);
	    this.handleLogoutClick = this.handleLogoutClick.bind(this);
	    this.state = {isLoggedIn: false};
	  }
	 
	  handleLoginClick() {
		  this.setState({isLoggedIn: true});
	  }
	 
	  handleLogoutClick() {
	    this.setState({isLoggedIn: false});
	  }
	 
	  render() {
	    const isLoggedIn = this.state.isLoggedIn;
	    let button = null;
	    if (isLoggedIn) {
	      button = <LogoutButton onClick={this.handleLogoutClick} />;
	    } else {
	      button = <LoginButton onClick={this.handleLoginClick} />;
	    }

	    return (
	      <div>
	        <Greeting isLoggedIn={isLoggedIn} />
	        {button}
	      </div>
	    );
	  }
	}

function Mailbox(props) {
	  const unreadMessages = props.unreadMessages;
	  return (
	    <div>
	      <h1>Hello!</h1>
	      {unreadMessages.length > 0 &&
	        <h2>
	          您有 {unreadMessages.length} 条未读信息。
	        </h2>
	      }
	    </div>
	  );
	}
const messages = ['React', 'Re: React', 'Re:Re: React'];
function WarningBanner(props) {
	  if (!props.warn) {
	    return null;
	  }
	 
	  return (
	    <div className="warning">
	      警告!
	    </div>
	  );
	}
	 
	class Page extends React.Component {
	  constructor(props) {
	    super(props);
	    this.state = {showWarning: true}
	    this.handleToggleClick = this.handleToggleClick.bind(this);
	  }
	 
	  handleToggleClick() {
	    this.setState(prevState => ({
	      showWarning: !prevState.showWarning
	    }));
	  }
	 
	  render() {
	    return (
	      <div>
	        <WarningBanner warn={this.state.showWarning} />
	        <button onClick={this.handleToggleClick}>
	          {this.state.showWarning ? '隐藏' : '显示'}
	        </button>
	      </div>
	    );
	  }
	}
	
	const numbers = [1, 2, 3, 4, 5];
	const listItems = numbers.map((num) =>
	  <li>{num}</li>
	);

	class Hello extends React.Component {
		 
		  constructor(props) {
		      super(props);
		      this.state = {opacity: 1.0};
		  }
		 
		  componentDidMount() {
		    this.timer = setInterval(function () {
		      var opacity = this.state.opacity;
		      opacity -= .05;
		      if (opacity < 0.1) {
		        opacity = 1.0;
		      }
		      this.setState({
		        opacity: opacity
		      });
		    }.bind(this), 100);
		  }
		 
		  render () {
		    return (
		      <div style={{opacity: this.state.opacity}}>
		        Hello {this.props.name}
		      </div>
		    );
		  }
		}
	
	
	class Content extends React.Component {
		  render() {
		    return  <div>
		            <input type="text" value={this.props.myDataProp} onChange={this.props.updateStateProp} /> 
		            <h4>{this.props.myDataProp}</h4>
		            </div>;
		  }
		}
		class HelloMessage extends React.Component {
		  constructor(props) {
		      super(props);
		      this.state = {value: 'Hello Runoob!'};
		      this.handleChange = this.handleChange.bind(this);
		  }
		 
		  handleChange(event) {
		    this.setState({value: event.target.value});
		  }
		  render() {
		    var value = this.state.value;
		    return <div>
		            <Content myDataProp = {value} 
		              updateStateProp = {this.handleChange}></Content>
		           </div>;
		  }
		}
		
		class FlavorForm extends React.Component {
			  constructor(props) {
			    super(props);
			    this.state = {value: 'coconut'};
			 
			    this.handleChange = this.handleChange.bind(this);
			    this.handleSubmit = this.handleSubmit.bind(this);
			  }
			 
			  handleChange(event) {
			    this.setState({value: event.target.value});
			  }
			 
			  handleSubmit(event) {
			    alert('Your favorite flavor is: ' + this.state.value);
			    event.preventDefault();
			  }
			 
			  render() {
			    return (
			      <form onSubmit={this.handleSubmit}>
			        <label>
			          选择您最喜欢的网站
			          <select value={this.state.value} onChange={this.handleChange}>
			            <option value="gg">Google</option>
			            <option value="rn">Runoob</option>
			            <option value="tb">Taobao</option>
			            <option value="fb">Facebook</option>
			          </select>
			        </label>
			        <input type="submit" value="提交" />
			      </form>
			    );
			  }
			}		
		
	ReactDOM.render(
	  (<div><Clock /><Clock /><ActionLink /><br /><br /><Toggle /><Greeting isLoggedIn={true} />
	  <Greeting isLoggedIn={false} /><LoginControl /><Mailbox unreadMessages={messages} />
	  <Page /><ul>{listItems}</ul><Hello /><HelloMessage /><FlavorForm /></div>),
	  document.getElementById('root')
	);
	
