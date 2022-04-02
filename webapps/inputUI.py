from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def home():
    return HELLO_HTML

HELLO_HTML = """
        <html><body>
            <h2>Welcome to the greeter</h2>
            <form action="/greet">
                what's your name? <input type='text' name='username'><br>
                what's your favorite food? <input type='text' name='favfood'><br>
                <input type='submit' value='Continue'>
            </form>
        </body></html>
        """
@app.route('/greet')
def greet():
    username = request.args.get('username', '')
    favfood = request.args.get('favfood', '')
    if username == '':
        username = 'World' 
    if favfood == '':
        msg = 'you did not tell me your favorite food.' 
    else:
        msg = 'I like ' + favfood + ', too.' 
    return GREET_HTML.format(username, msg) 

GREET_HTML = """
    <html><body>
        <h2>Hello, {0}!</h2> 
        {1}
    </body><html>
    """

if __name__ == "__main__":
    # Launch the Flask dev server
    app.run(host="localhost", debug=True)

# https://runestone.academy/ns/books/published/thinkcspy/WebApps/07-InputForAFlaskWebApplication.html