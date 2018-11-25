#!/usr/bin/env python
# -*- coding: utf-8 -*-
from flask import Flask, Blueprint
from flask_restplus import Api, Resource

__version__ = "0.1"
app = Flask(__name__)
blueprint = Blueprint('api', __name__, url_prefix='/api')

api = Api(blueprint)
app.register_blueprint(blueprint)

nstest = api.namespace('test', description='测试')


@nstest.route('/hello')
class HelloWorld(Resource):
    def get(self):
        return 'hello'


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=9000, debug=True)
