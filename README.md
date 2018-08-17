# junit5-with-springboot
## 目的
JUnit5でSpringBootのテストを動かす

## ハマったところ
### IntelliJ IDEA Ultimate 2017.2系ではJUnit5.2が動かなかった
JUnitのライブラリを5.0.0にしたら動いたのでIDEAのバージョンを2018.2系にあげたら動いた
https://stackoverflow.com/questions/46384624/java-lang-nosuchmethoderror-when-run-test-with-junit-5

### RunWithアノテーションがJUnit5ではなくなっていた
とりあえず `@SpringJUnitConfig` つけといた。
https://qiita.com/kazuki43zoo/items/4a9ead225a9a9897af4a

## REST Assured
### 制約有無
- 送信できるHTTPメソッドに制約はなさそう
- レスポンスの検証について、JSON/XMLなどのBodyだけでなく、HTTPヘッダーやCookieなどの検証も可能
- Json Scheamaでの検証も可能
- リクエストパラメータはFormパラメータ/クエリパラメータどちらの形でも送信できる
- リクエストパラメータにオブジェクトも指定可能
- 認証はBacicやOAuth。SpringSecurityも可能みたいだが、詳しく見れてない
