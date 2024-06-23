# todo-api-notes

This is a simple todo notes API v.0.0.1.

GitHub repo:https://github.com/dedetoya12242010/todo-api-notes.git

Endpoints:
· POST /notes: Create a new note.
· GET /notes: Retrieve all notes.
· GET /notes/:id: Retrieve a specific note by ID.
· PUT /notes/:id: Update a specific note.
· DELETE /notes/:id: Delete a specific note.

HOW TO TEST (Using POSTMAN client):

1)
METHOD: POST
URL:  http://localhost:8080/todo/notes
Body: 
{
    "title": "Title Test"
    "body": "Body Test
}

2)
METHOD: GET
GET ALL
URL: http://localhost:8080/todo/notes

3)
METHOD: GET
GET BY ID:
URL: http://localhost:8080/todo/notes?id=1

4)
METHOD: UPDATE
UPDATE notes
URL: http://localhost:8080/todo/notes
{
    "title": "T1_update",
    "body": "D1",
    "id": 1
}

5)
METHOD: DELETE
Where 1 is dynamic id.

URL: http://localhost:8080/todo/notes/1

