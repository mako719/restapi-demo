# 第七回課題

SpringでHTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerの実装

# GET

クエリ文字列で名前を受け取れるようにしています（yoshida, tanaka）。

また、リクエストを送るごとにidが1ずつ増えるようにしています。

空文字の場合はuserが返されるようにしています。

![スクリーンショット 2022-12-09 15 54 07](https://user-images.githubusercontent.com/118739580/206653439-fef2daac-f20a-4682-a114-cfb1ce5765bb.jpg)
![スクリーンショット 2022-12-09 15 54 52](https://user-images.githubusercontent.com/118739580/206653496-67c00cfa-47f3-4169-96a5-9291ce2db144.jpg)
![スクリーンショット 2022-12-09 15 55 53](https://user-images.githubusercontent.com/118739580/206653611-c71124dd-b7e6-4925-b8f2-b4438a3ac38a.jpg)

# POST

kato, suzukiを登録。

20文字以上、空文字はエラーが返されるようにしました。
![スクリーンショット 2022-12-09 16 03 04](https://user-images.githubusercontent.com/118739580/206653770-24b62909-5165-4b07-bd23-79bab6988a90.jpg)
![スクリーンショット 2022-12-09 16 03 30](https://user-images.githubusercontent.com/118739580/206653792-cc3562a2-18c6-4270-952a-9ae6edd6b0cc.jpg)
![スクリーンショット 2022-12-09 16 04 22](https://user-images.githubusercontent.com/118739580/206654073-0afd7a4f-0edb-4f69-a02d-ad24b5eaf684.jpg)
![スクリーンショット 2022-12-09 16 05 00](https://user-images.githubusercontent.com/118739580/206654090-0452e899-2ac0-4bdc-9416-9cc2da743a9b.jpg)

# PATCH

suzukiをmr.suzukiに変更。

POST同様20文字以上、空文字はエラーが返されるようにしました。
![スクリーンショット 2022-12-09 16 12 01](https://user-images.githubusercontent.com/118739580/206654358-da3e4db5-b5df-4489-ac77-54039575f518.jpg)
![スクリーンショット 2022-12-09 16 12 43](https://user-images.githubusercontent.com/118739580/206654366-e8530350-cc4d-41b8-beec-f591f18bff89.jpg)
![スクリーンショット 2022-12-09 16 13 07](https://user-images.githubusercontent.com/118739580/206654374-89660643-cdea-4fe0-a049-e7140b0f3413.jpg)

# DELETE

suzukiのDELETE
![スクリーンショット 2022-12-09 16 14 06](https://user-images.githubusercontent.com/118739580/206654665-c59b77cb-83a3-46ea-8078-4cec4aae401a.jpg)
