package com.github.ephemeral9794.niconico.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NicoWatchData(
	@Json(name = "ad")
	val ad: Ad?,
	@Json(name = "channel")
	val channel: Channel?,
	@Json(name = "commentComposite")
	val commentComposite: CommentComposite?,
	@Json(name = "community")
	val community: Any?,
	@Json(name = "context")
	val context: Context?,
	@Json(name = "dataLayer")
	val dataLayer: DataLayer?,
	@Json(name = "lead")
	val lead: Lead?,
	@Json(name = "liveTopics")
	val liveTopics: LiveTopics?,
	@Json(name = "mainCommunity")
	val mainCommunity: Any?,
	@Json(name = "maintenance")
	val maintenance: Any?,
	@Json(name = "owner")
	val owner: Any?,
	@Json(name = "player")
	val player: Player?,
	@Json(name = "playlist")
	val playlist: Any?,
	@Json(name = "series")
	val series: Any?,
	@Json(name = "tags")
	val tags: List<Tag?>?,
	@Json(name = "thread")
	val thread: ThreadX?,
	@Json(name = "video")
	val video: Video?,
	@Json(name = "viewer")
	val viewer: Viewer?,
	@Json(name = "watchRecommendationRecipe")
	val watchRecommendationRecipe: String?
)

@JsonClass(generateAdapter = true)
data class Ad(
	@Json(name = "vastMetaData")
	val vastMetaData: Any?,
	@Json(name = "vastReason")
	val vastReason: Any?
)

@JsonClass(generateAdapter = true)
data class Channel(
	@Json(name = "channelPrice")
	val channelPrice: Any?,
	@Json(name = "favoriteToken")
	val favoriteToken: String?,
	@Json(name = "favoriteTokenTime")
	val favoriteTokenTime: Int?,
	@Json(name = "globalId")
	val globalId: String?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "isDisplayAdBanner")
	val isDisplayAdBanner: Boolean?,
	@Json(name = "isFavorited")
	val isFavorited: Boolean?,
	@Json(name = "isFirstMonthFree")
	val isFirstMonthFree: Boolean?,
	@Json(name = "name")
	val name: String?,
	@Json(name = "ngList")
	val ngList: List<Ng?>?,
	@Json(name = "threadType")
	val threadType: String?
)

@JsonClass(generateAdapter = true)
data class Ng(
	@Json(name = "destination")
	val destination: String?,
	@Json(name = "source")
	val source: String?
)

@JsonClass(generateAdapter = true)
data class CommentComposite(
	@Json(name = "layers")
	val layers: List<Layer?>?,
	@Json(name = "threads")
	val threads: List<Thread?>?
)

@JsonClass(generateAdapter = true)
data class Layer(
	@Json(name = "index")
	val index: Int?,
	@Json(name = "isTranslucent")
	val isTranslucent: Boolean?,
	@Json(name = "threadIds")
	val threadIds: List<ThreadId?>?
)

@JsonClass(generateAdapter = true)
data class ThreadId(
	@Json(name = "fork")
	val fork: Int?,
	@Json(name = "id")
	val id: Int?
)

@JsonClass(generateAdapter = true)
data class Thread(
	@Json(name = "fork")
	val fork: Int?,
	@Json(name = "hasNicoscript")
	val hasNicoscript: Boolean?,
	@Json(name = "id")
	val id: Int?,
	@Json(name = "isActive")
	val isActive: Boolean?,
	@Json(name = "isDefaultPostTarget")
	val isDefaultPostTarget: Boolean?,
	@Json(name = "isLeafRequired")
	val isLeafRequired: Boolean?,
	@Json(name = "isOwnerThread")
	val isOwnerThread: Boolean?,
	@Json(name = "isThreadkeyRequired")
	val isThreadkeyRequired: Boolean?,
	@Json(name = "label")
	val label: String?,
	@Json(name = "postkeyStatus")
	val postkeyStatus: Int?
)

@JsonClass(generateAdapter = true)
data class Context(
	@Json(name = "accessFrom")
	val accessFrom: Any?,
	@Json(name = "csrfToken")
	val csrfToken: String?,
	@Json(name = "genreKey")
	val genreKey: String?,
	@Json(name = "genreName")
	val genreName: String?,
	@Json(name = "highestGenreRanking")
	val highestGenreRanking: HighestGenreRanking?,
	@Json(name = "highestRank")
	val highestRank: Any?,
	@Json(name = "highestRepresentedTagRanking")
	val highestRepresentedTagRanking: List<HighestRepresentedTagRanking?>?,
	@Json(name = "initialPlaybackPosition")
	val initialPlaybackPosition: Int?,
	@Json(name = "initialPlaybackType")
	val initialPlaybackType: String?,
	@Json(name = "isAdultRatingNG")
	val isAdultRatingNG: Boolean?,
	@Json(name = "isAllowEmbedPlayer")
	val isAllowEmbedPlayer: Boolean?,
	@Json(name = "isAuthenticationRequired")
	val isAuthenticationRequired: Boolean?,
	@Json(name = "isDefaultCommentInvisible")
	val isDefaultCommentInvisible: Boolean?,
	@Json(name = "isDictionaryDisplayable")
	val isDictionaryDisplayable: Boolean?,
	@Json(name = "isDisabledMarquee")
	val isDisabledMarquee: Any?,
	@Json(name = "isDownloadCompleteWait")
	val isDownloadCompleteWait: Any?,
	@Json(name = "isMyMemory")
	val isMyMemory: Boolean?,
	@Json(name = "isNeedAdmission")
	val isNeedAdmission: Boolean?,
	@Json(name = "isNeedPayment")
	val isNeedPayment: Boolean?,
	@Json(name = "isNoMovie")
	val isNoMovie: Any?,
	@Json(name = "isNoNicotic")
	val isNoNicotic: Any?,
	@Json(name = "isNoRelatedVideo")
	val isNoRelatedVideo: Any?,
	@Json(name = "isOwnerThreadEditable")
	val isOwnerThreadEditable: Any?,
	@Json(name = "isPPV")
	val isPPV: Boolean?,
	@Json(name = "isPeakTime")
	val isPeakTime: Boolean?,
	@Json(name = "isPlayable")
	val isPlayable: Boolean?,
	@Json(name = "isTagUneditable")
	val isTagUneditable: Boolean?,
	@Json(name = "isThreadOwner")
	val isThreadOwner: Boolean?,
	@Json(name = "isTranslatable")
	val isTranslatable: Boolean?,
	@Json(name = "isVideoOwner")
	val isVideoOwner: Boolean?,
	@Json(name = "linkedChannelVideos")
	val linkedChannelVideos: Any?,
	@Json(name = "ngRevision")
	val ngRevision: Int?,
	@Json(name = "ownerNGList")
	val ownerNGList: List<OwnerNG?>?,
	@Json(name = "playFrom")
	val playFrom: Any?,
	@Json(name = "playLength")
	val playLength: Any?,
	@Json(name = "representedTags")
	val representedTags: List<String?>?,
	@Json(name = "returnId")
	val returnId: Any?,
	@Json(name = "returnMsg")
	val returnMsg: Any?,
	@Json(name = "returnTo")
	val returnTo: Any?,
	@Json(name = "translationVersionJsonUpdateTime")
	val translationVersionJsonUpdateTime: Int?,
	@Json(name = "useChecklistCache")
	val useChecklistCache: Any?,
	@Json(name = "userkey")
	val userkey: String?,
	@Json(name = "watchAuthKey")
	val watchAuthKey: String?,
	@Json(name = "watchId")
	val watchId: String?,
	@Json(name = "watchPageServerTime")
	val watchPageServerTime: Long?,
	@Json(name = "watchTrackId")
	val watchTrackId: String?,
	@Json(name = "yesterdayRank")
	val yesterdayRank: Any?
)

@JsonClass(generateAdapter = true)
data class HighestGenreRanking(
	@Json(name = "dateTime")
	val dateTime: String?,
	@Json(name = "genre")
	val genre: String?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "rank")
	val rank: Int?
)

@JsonClass(generateAdapter = true)
data class HighestRepresentedTagRanking(
	@Json(name = "dateTime")
	val dateTime: String?,
	@Json(name = "genre")
	val genre: String?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "rank")
	val rank: Int?,
	@Json(name = "regularizedTag")
	val regularizedTag: String?,
	@Json(name = "tag")
	val tag: String?
)

@JsonClass(generateAdapter = true)
data class OwnerNG(
	@Json(name = "destination")
	val destination: String?,
	@Json(name = "source")
	val source: String?
)

@JsonClass(generateAdapter = true)
data class DataLayer(
	@Json(name = "ch_register_status")
	val chRegisterStatus: String?,
	@Json(name = "channel_id")
	val channelId: String?,
	@Json(name = "pay_status")
	val payStatus: String?
)

@JsonClass(generateAdapter = true)
data class Lead(
	@Json(name = "tagRelatedBanner")
	val tagRelatedBanner: Any?,
	@Json(name = "tagRelatedMarquee")
	val tagRelatedMarquee: TagRelatedMarquee?,
	@Json(name = "videoEndBannerIn")
	val videoEndBannerIn: Any?,
	@Json(name = "videoEndOverlay")
	val videoEndOverlay: Any?
)

@JsonClass(generateAdapter = true)
data class TagRelatedMarquee(
	@Json(name = "id")
	val id: String?,
	@Json(name = "title")
	val title: String?,
	@Json(name = "url")
	val url: String?
)

@JsonClass(generateAdapter = true)
data class LiveTopics(
	@Json(name = "items")
	val items: List<Item?>?
)

@JsonClass(generateAdapter = true)
data class Item(
	@Json(name = "communityId")
	val communityId: String?,
	@Json(name = "communityName")
	val communityName: String?,
	@Json(name = "elapsedTimeM")
	val elapsedTimeM: Int?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "isHigh")
	val isHigh: Boolean?,
	@Json(name = "point")
	val point: Int?,
	@Json(name = "thumbnailURL")
	val thumbnailURL: String?,
	@Json(name = "title")
	val title: String?
)

@JsonClass(generateAdapter = true)
data class Player(
	@Json(name = "isContinuous")
	val isContinuous: Boolean?,
	@Json(name = "playerInfoXMLUpdateTIme")
	val playerInfoXMLUpdateTIme: Int?
)

@JsonClass(generateAdapter = true)
data class Tag(
	@Json(name = "id")
	val id: String?,
	@Json(name = "isCategory")
	val isCategory: Boolean?,
	@Json(name = "isCategoryCandidate")
	val isCategoryCandidate: Boolean?,
	@Json(name = "isDictionaryExists")
	val isDictionaryExists: Boolean?,
	@Json(name = "isLocked")
	val isLocked: Boolean?,
	@Json(name = "isRepresentedTag")
	val isRepresentedTag: Boolean?,
	@Json(name = "name")
	val name: String?
)

@JsonClass(generateAdapter = true)
data class ThreadX(
	@Json(name = "commentCount")
	val commentCount: Int?,
	@Json(name = "hasOwnerThread")
	val hasOwnerThread: String?,
	@Json(name = "ids")
	val ids: Ids?,
	@Json(name = "mymemoryLanguage")
	val mymemoryLanguage: Any?,
	@Json(name = "serverUrl")
	val serverUrl: String?,
	@Json(name = "subServerUrl")
	val subServerUrl: String?
)

@JsonClass(generateAdapter = true)
data class Ids(
	@Json(name = "community")
	val community: String?,
	@Json(name = "default")
	val default: String?,
	@Json(name = "nicos")
	val nicos: Any?
)

@JsonClass(generateAdapter = true)
data class Video(
	@Json(name = "backCommentType")
	val backCommentType: Any?,
	@Json(name = "badges")
	val badges: Any?,
	@Json(name = "channelId")
	val channelId: String?,
	@Json(name = "description")
	val description: String?,
	@Json(name = "dmcInfo")
	val dmcInfo: DmcInfo?,
	@Json(name = "duration")
	val duration: Int?,
	@Json(name = "height")
	val height: Any?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "isAdult")
	val isAdult: Boolean?,
	@Json(name = "isCommentExpired")
	val isCommentExpired: Boolean?,
	@Json(name = "isCommonsTreeExists")
	val isCommonsTreeExists: Boolean?,
	@Json(name = "isCommunityMemberOnly")
	val isCommunityMemberOnly: String?,
	@Json(name = "isDeleted")
	val isDeleted: Boolean?,
	@Json(name = "isMonetized")
	val isMonetized: Boolean?,
	@Json(name = "isNicowari")
	val isNicowari: Any?,
	@Json(name = "isNoBanner")
	val isNoBanner: String?,
	@Json(name = "isNoIchiba")
	val isNoIchiba: Boolean?,
	@Json(name = "isNoNGS")
	val isNoNGS: Any?,
	@Json(name = "isOfficial")
	val isOfficial: Boolean?,
	@Json(name = "isOfficialAnime")
	val isOfficialAnime: Int?,
	@Json(name = "isPublic")
	val isPublic: Boolean?,
	@Json(name = "isPublishedNicoscript")
	val isPublishedNicoscript: Any?,
	@Json(name = "isR18")
	val isR18: Boolean?,
	@Json(name = "isTranslated")
	val isTranslated: Boolean?,
	@Json(name = "isWide")
	val isWide: Any?,
	@Json(name = "largeThumbnailURL")
	val largeThumbnailURL: String?,
	@Json(name = "mainCommunityId")
	val mainCommunityId: Any?,
	@Json(name = "movieType")
	val movieType: String?,
	@Json(name = "mylistCount")
	val mylistCount: Int?,
	@Json(name = "originalDescription")
	val originalDescription: String?,
	@Json(name = "originalPostedDateTime")
	val originalPostedDateTime: Any?,
	@Json(name = "originalTitle")
	val originalTitle: String?,
	@Json(name = "postedDateTime")
	val postedDateTime: String?,
	@Json(name = "smileInfo")
	val smileInfo: SmileInfo?,
	@Json(name = "thumbnailURL")
	val thumbnailURL: String?,
	@Json(name = "title")
	val title: String?,
	@Json(name = "translation")
	val translation: Boolean?,
	@Json(name = "translator")
	val translator: Any?,
	@Json(name = "viewCount")
	val viewCount: Int?,
	@Json(name = "width")
	val width: Any?
)

@JsonClass(generateAdapter = true)
data class DmcInfo(
	@Json(name = "error")
	val error: Any?,
	@Json(name = "import_version")
	val importVersion: Int?,
	@Json(name = "quality")
	val quality: Quality?,
	@Json(name = "session_api")
	val sessionApi: SessionApi?,
	@Json(name = "storyboard_session_api")
	val storyboardSessionApi: StoryboardSessionApi?,
	@Json(name = "thread")
	val thread: ThreadXX?,
	@Json(name = "time")
	val time: Int?,
	@Json(name = "time_ms")
	val timeMs: Long?,
	@Json(name = "tracking_id")
	val trackingId: String?,
	@Json(name = "user")
	val user: User?,
	@Json(name = "video")
	val video: VideoXX?
)

@JsonClass(generateAdapter = true)
data class Quality(
	@Json(name = "audios")
	val audios: List<Audio?>?,
	@Json(name = "videos")
	val videos: List<VideoX?>?
)

@JsonClass(generateAdapter = true)
data class Audio(
	@Json(name = "available")
	val available: Boolean?,
	@Json(name = "bitrate")
	val bitrate: Int?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "sampling_rate")
	val samplingRate: Int?
)

@JsonClass(generateAdapter = true)
data class VideoX(
	@Json(name = "available")
	val available: Boolean?,
	@Json(name = "bitrate")
	val bitrate: Int?,
	@Json(name = "id")
	val id: String?,
	@Json(name = "label")
	val label: String?,
	@Json(name = "level_index")
	val levelIndex: Int?,
	@Json(name = "resolution")
	val resolution: Resolution?
)

@JsonClass(generateAdapter = true)
data class Resolution(
	@Json(name = "height")
	val height: Int?,
	@Json(name = "width")
	val width: Int?
)

@JsonClass(generateAdapter = true)
data class SessionApi(
	@Json(name = "audios")
	val audios: List<String?>?,
	@Json(name = "auth_types")
	val authTypes: AuthTypes?,
	@Json(name = "content_id")
	val contentId: String?,
	@Json(name = "content_key_timeout")
	val contentKeyTimeout: Int?,
	@Json(name = "heartbeat_lifetime")
	val heartbeatLifetime: Int?,
	@Json(name = "movies")
	val movies: List<Any?>?,
	@Json(name = "player_id")
	val playerId: String?,
	@Json(name = "priority")
	val priority: Int?,
	@Json(name = "protocols")
	val protocols: List<String?>?,
	@Json(name = "recipe_id")
	val recipeId: String?,
	@Json(name = "service_user_id")
	val serviceUserId: String?,
	@Json(name = "signature")
	val signature: String?,
	@Json(name = "token")
	val token: String?,
	@Json(name = "transfer_presets")
	val transferPresets: List<String?>?,
	@Json(name = "urls")
	val urls: List<Url?>?,
	@Json(name = "videos")
	val videos: List<String?>?
)

@JsonClass(generateAdapter = true)
data class AuthTypes(
	@Json(name = "hls")
	val hls: String?,
	@Json(name = "http")
	val http: String?
)

@JsonClass(generateAdapter = true)
data class Url(
	@Json(name = "is_ssl")
	val isSsl: Boolean?,
	@Json(name = "is_well_known_port")
	val isWellKnownPort: Boolean?,
	@Json(name = "url")
	val url: String?
)

@JsonClass(generateAdapter = true)
data class StoryboardSessionApi(
	@Json(name = "audios")
	val audios: List<Any?>?,
	@Json(name = "auth_types")
	val authTypes: AuthTypesX?,
	@Json(name = "content_id")
	val contentId: String?,
	@Json(name = "content_key_timeout")
	val contentKeyTimeout: Int?,
	@Json(name = "heartbeat_lifetime")
	val heartbeatLifetime: Int?,
	@Json(name = "movies")
	val movies: List<Any?>?,
	@Json(name = "player_id")
	val playerId: String?,
	@Json(name = "priority")
	val priority: Int?,
	@Json(name = "protocols")
	val protocols: List<String?>?,
	@Json(name = "recipe_id")
	val recipeId: String?,
	@Json(name = "service_user_id")
	val serviceUserId: String?,
	@Json(name = "signature")
	val signature: String?,
	@Json(name = "token")
	val token: String?,
	@Json(name = "transfer_presets")
	val transferPresets: List<Any?>?,
	@Json(name = "urls")
	val urls: List<UrlX?>?,
	@Json(name = "videos")
	val videos: List<String?>?
)

@JsonClass(generateAdapter = true)
data class AuthTypesX(
	@Json(name = "storyboard")
	val storyboard: String?
)

@JsonClass(generateAdapter = true)
data class UrlX(
	@Json(name = "is_ssl")
	val isSsl: Boolean?,
	@Json(name = "is_well_known_port")
	val isWellKnownPort: Boolean?,
	@Json(name = "url")
	val url: String?
)

@JsonClass(generateAdapter = true)
data class ThreadXX(
	@Json(name = "channel_ng_words")
	val channelNgWords: List<Any?>?,
	@Json(name = "maintenances_ng")
	val maintenancesNg: Boolean?,
	@Json(name = "ng_revision")
	val ngRevision: Int?,
	@Json(name = "nicos_thread_id")
	val nicosThreadId: Any?,
	@Json(name = "optional_thread_id")
	val optionalThreadId: Int?,
	@Json(name = "owner_ng_words")
	val ownerNgWords: List<Any?>?,
	@Json(name = "postkey_available")
	val postkeyAvailable: Boolean?,
	@Json(name = "server_url")
	val serverUrl: String?,
	@Json(name = "sub_server_url")
	val subServerUrl: String?,
	@Json(name = "thread_id")
	val threadId: Int?,
	@Json(name = "thread_key_required")
	val threadKeyRequired: Boolean?
)

@JsonClass(generateAdapter = true)
data class User(
	@Json(name = "is_premium")
	val isPremium: Boolean?,
	@Json(name = "nickname")
	val nickname: String?,
	@Json(name = "user_id")
	val userId: Int?
)

@JsonClass(generateAdapter = true)
data class VideoXX(
	@Json(name = "deleted")
	val deleted: Int?,
	@Json(name = "length_seconds")
	val lengthSeconds: Int?,
	@Json(name = "video_id")
	val videoId: String?
)

@JsonClass(generateAdapter = true)
data class SmileInfo(
	@Json(name = "currentQualityId")
	val currentQualityId: String?,
	@Json(name = "isSlowLine")
	val isSlowLine: Boolean?,
	@Json(name = "qualityIds")
	val qualityIds: List<String?>?,
	@Json(name = "url")
	val url: String?
)

@JsonClass(generateAdapter = true)
data class Viewer(
	@Json(name = "age")
	val age: Int?,
	@Json(name = "id")
	val id: Int?,
	@Json(name = "isBicentennial")
	val isBicentennial: Boolean?,
	@Json(name = "isHtrzm")
	val isHtrzm: Boolean?,
	@Json(name = "isPostLocked")
	val isPostLocked: Boolean?,
	@Json(name = "isPremium")
	val isPremium: Boolean?,
	@Json(name = "isTwitterConnection")
	val isTwitterConnection: Boolean?,
	@Json(name = "nickname")
	val nickname: String?,
	@Json(name = "nicosid")
	val nicosid: String?,
	@Json(name = "prefecture")
	val prefecture: Int?,
	@Json(name = "sex")
	val sex: Int?
)