// var argscheck = require('cordova/argscheck');
// var channel = require('cordova/channel');
// var utils = require('cordova/utils');
var exec = require('cordova/exec');
// var cordova = require('cordova');

var PLUGIN_NAME = 'MyCordovaPlugin';

var MyCordovaPlugin = {
    echo: function(phrase, cb) {
        exec(cb, null, PLUGIN_NAME, 'echo', [phrase])
    }, 
    getDate: function(cb) {
        exec(cb, null, Pl)
    }
};

module.exports = new MyCordovaPlugin();