#ifndef GDEXAMPLE_H
#define GDEXAMPLE_H

#include <godot_cpp/classes/node3d.hpp>

namespace godot {
class W2CPPBridge: public Node3D {
	GDCLASS(W2CPPBridge, Node3D)

protected:
	static void _bind_methods();

public:
	W2CPPBridge();
	~W2CPPBridge();

	void _process(double delta) override;
};

}

#endif
