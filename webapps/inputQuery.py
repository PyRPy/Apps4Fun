from flask import Flask, request
from datetime import datetime

app = Flask(__name__)

@app.route('/')
def hello():
    if 'name' in request.args:
        name = request.args['name'] 
    else:
        name = 'World'
    return HELLO_HTML.format(name, str(datetime.now())) 

HELLO_HTML = """
        <html><body>
            <h1>Hello, {0}!</h1>
            The time is {1}.
        </body></html>
        """
if __name__ == "__main__":
    # Launch the Flask dev server
    app.run(host="localhost", debug=True)

# https://runestone.academy/ns/books/published/thinkcspy/WebApps/07-InputForAFlaskWebApplication.html