// ���� events ģ��
var events = require('events');
// ���� eventEmitter ����
var eventEmitter = new events.EventEmitter();

// �����¼��������
var connectHandler = function connected() {
   console.log('���ӳɹ���');
  var data = {"id":"1","name":"roilat"};
   // ���� data_received �¼� 
   eventEmitter.emit('data_received',data);
}

// �� connection �¼��������
eventEmitter.on('connection', connectHandler);
 
// ʹ������������ data_received �¼�
eventEmitter.on('data_received', function(data){
	console.log(data);
	console.log('���ݽ��ճɹ���');
});


var http = require('http');

http.createServer(function (request, response) {

    // ���� HTTP ͷ�� 
    // HTTP ״ֵ̬: 200 : OK
    // ��������: text/plain
    response.writeHead(200, {'Content-Type': 'text/plain'});

    // ������Ӧ���� "Hello World"
    response.end('Hello World\n');
}).listen(8888);

event.on('some_event', function() { 
    console.log('some_event �¼�����'); 
}); 
setTimeout(function() { 
    event.emit('some_event'); 
}, 1000); 