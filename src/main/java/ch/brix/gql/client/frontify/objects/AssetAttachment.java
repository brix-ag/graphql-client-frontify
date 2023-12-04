package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetAttachment implements ch.brix.gql.client.frontify.interfaces.Node, ch.brix.gql.client.frontify.interfaces.Attachment {
  /**
   * `Attachment` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * The `creator` is the `User` who created this `Attachment`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * `DateTime` of the `Attachment` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * The `modifier` is the `User` who last modified this `Attachment`.
   */
  @com.google.gson.annotations.SerializedName("modifier")
  private ch.brix.gql.client.frontify.interfaces.User modifier;
  /**
   * `DateTime` of the `Attachment`last modification.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * Name of the `Attachment`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * Filename of the `Attachment` `File`.
   */
  @com.google.gson.annotations.SerializedName("filename")
  private ch.brix.gql.client.frontify.scalars.StringScalar filename;
  /**
   * Mediatype (MIME) of the `Attachment`.
   */
  @com.google.gson.annotations.SerializedName("type")
  private ch.brix.gql.client.frontify.scalars.StringScalar type;
  /**
   * External Id of the `Attachment`.
   */
  @com.google.gson.annotations.SerializedName("externalId")
  private ch.brix.gql.client.frontify.scalars.IdScalar externalId;
  /**
   * Extension of the `Attachment` `File`.
   */
  @com.google.gson.annotations.SerializedName("extension")
  private ch.brix.gql.client.frontify.scalars.StringScalar extension;
  /**
   * Size of the `Attachment` `File` in bytes.
   */
  @com.google.gson.annotations.SerializedName("size")
  private ch.brix.gql.client.frontify.scalars.BigIntScalar size;
  /**
   * Signed `Url` to download the original `AssetAttachment` from Frontify.
   */
  @com.google.gson.annotations.SerializedName("downloadUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar downloadUrl;
}
