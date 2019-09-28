package com.github.ephemeral9794.niconico.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DmcSessionRequest(
	@Json(name = "client_info")
	val clientInfo: ClientInfo?,
	@Json(name = "content_auth")
	val contentAuth: ContentAuth?,
	@Json(name = "content_uri")
	val contentUri: String?,
	@Json(name = "priority")
	val priority: Int?,
	@Json(name = "session")
	val session: Session?,
	@Json(name = "session_operatio_auth")
	val sessionOperatioAuth: SessionOperatioAuth?
)

@JsonClass(generateAdapter = true)
data class ClientInfo(
	@Json(name = "player_id")
	val playerId: String?
)

@JsonClass(generateAdapter = true)
data class ContentAuth(
	@Json(name = "auth_type")
	val authType: String?,
	@Json(name = "content_key_timeout")
	val contentKeyTimeout: Int?,
	@Json(name = "service_id")
	val serviceId: String?,
	@Json(name = "service_user_id")
	val serviceUserId: String?
)

@JsonClass(generateAdapter = true)
data class Session(
	@Json(name = "content_id")
	val contentId: String?,
	@Json(name = "content_src_id_sets")
	val contentSrcIdSets: List<ContentSrcIdSet?>?,
	@Json(name = "content_type")
	val contentType: String?,
	@Json(name = "keep_method")
	val keepMethod: KeepMethod?,
	@Json(name = "protocol")
	val protocol: Protocol?,
	@Json(name = "recipe_id")
	val recipeId: String?,
	@Json(name = "timing_constraint")
	val timingConstraint: String?
)

@JsonClass(generateAdapter = true)
data class ContentSrcIdSet(
	@Json(name = "allow_subset")
	val allowSubset: Any?,
	@Json(name = "content_src_ids")
	val contentSrcIds: List<ContentSrcId?>?
)

@JsonClass(generateAdapter = true)
data class ContentSrcId(
	@Json(name = "src_id_to_mux")
	val srcIdToMux: SrcIdToMux?
)

@JsonClass(generateAdapter = true)
data class SrcIdToMux(
	@Json(name = "audio_src_ids")
	val audioSrcIds: List<String?>?,
	@Json(name = "video_src_ids")
	val videoSrcIds: List<String?>?
)

@JsonClass(generateAdapter = true)
data class KeepMethod(
	@Json(name = "heartbeat")
	val heartbeat: Heartbeat?
)

@JsonClass(generateAdapter = true)
data class Heartbeat(
	@Json(name = "lifetime")
	val lifetime: Int?,
	@Json(name = "onetime_token")
	val onetimeToken: String?
)

@JsonClass(generateAdapter = true)
data class Protocol(
	@Json(name = "name")
	val name: String?,
	@Json(name = "parameters")
	val parameters: Parameters?
)

@JsonClass(generateAdapter = true)
data class Parameters(
	@Json(name = "http_parameters")
	val httpParameters: HttpParameters?
)

@JsonClass(generateAdapter = true)
data class HttpParameters(
	@Json(name = "parameters")
	val parameters: ParametersX?
)

@JsonClass(generateAdapter = true)
data class ParametersX(
	@Json(name = "http_output_download_parameters")
	val httpOutputDownloadParameters: String?,
	@Json(name = "use_ssl")
	val useSsl: String?
)

@JsonClass(generateAdapter = true)
data class SessionOperatioAuth(
	@Json(name = "session_operation_auth_by_signature")
	val sessionOperationAuthBySignature: SessionOperationAuthBySignature?
)

@JsonClass(generateAdapter = true)
data class SessionOperationAuthBySignature(
	@Json(name = "signature")
	val signature: String?,
	@Json(name = "token")
	val token: String?
)
