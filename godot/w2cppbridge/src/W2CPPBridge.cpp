#include "W2CPPBridge.h"
#include <stdio.h>
#include <godot_cpp/core/class_db.hpp>
#include <godot_cpp/variant/utility_functions.hpp>

using namespace godot;

void W2CPPBridge::_bind_methods() {
	// todo
}

W2CPPBridge::W2CPPBridge() {
	UtilityFunctions::print("init");
}

W2CPPBridge::~W2CPPBridge() {
	// cleanup
}

int n = 0;

void fuck_it_up(void) {
	for (int i = 0; i < 0x1000; i++) {
		for (int j = 0; j < 0x1000; j++) {
			n += i*j;
		}
	}

	UtilityFunctions::print(n);
}

void W2CPPBridge::_process(double delta) {
	UtilityFunctions::print("fuck you");

//	fuck_it_up();
}
