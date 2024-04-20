extends Node3D

var xr_interface: XRInterface

func enable_passthrough() -> bool:
	if xr_interface and xr_interface.is_passthrough_supported():
		if !xr_interface.start_passthrough():
			return false
 	else:
		var modes = xr_interface.get_supported_environment_blend_modes()
		if xr_interface.XR_ENV_BLEND_MODE_ALPHA_BLEND in modes:
			xr_interface.set_environment_blend_mode(xr_interface.XR_ENV_BLEND_MODE_ALPHA_BLEND)
		else:
	  		return false

	get_viewport().transparent_bg = true
	return true


# Called when the node enters the scene tree for the first time.
func _ready():
	xr_interface = XRServer.find_interface("OpenXR")
	
	if xr_interface and xr_interface.is_initialized():
		print("init success")
		DisplayServer.window_set_vsync_mode(DisplayServer.VSYNC_DISABLED)
		
		get_viewport().use_xr = true
		
		enable_passthrough()
		
	else:
		print("fuck")

# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta):
	pass
