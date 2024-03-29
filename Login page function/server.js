const express = require('express');
const app = express();
const port = 3000;

// 정적 파일을 제공하기 위한 설정
app.use(express.static('public'));

// URL 인코딩된 데이터를 파싱하기 위한 설정
app.use(express.urlencoded({ extended: true }));

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/public/index.html');
});

app.post('/login', (req, res) => {
    // 요청에서 로그인 정보 추출
    const { username, password } = req.body;
    console.log(`Username: ${username}, Password: ${password}`);
    // 여기에 로그인 검증 로직을 추가하세요
    res.send('로그인 시도: ' + username);
});

app.listen(port, () => {
    console.log(`Server listening at http://localhost:${port}`);
});
