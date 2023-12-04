package ch.brix.gql.client.frontify.builders;

public class On_AssetAttachment extends ch.brix.gql.client.TypeBuilder {
  public On_AssetAttachment() {
    super(new ch.brix.gql.client.On("AssetAttachment"));
  }
  /**
   * `Attachment` Id.
   */
  public On_AssetAttachment id() {
    _add_field("id");
    return this;
  }
  /**
   * The `creator` is the `User` who created this `Attachment`.
   */
  public On_AssetAttachment creator(AssetAttachment_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Attachment` creation.
   */
  public On_AssetAttachment createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `modifier` is the `User` who last modified this `Attachment`.
   */
  public On_AssetAttachment modifier(AssetAttachment_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Attachment`last modification.
   */
  public On_AssetAttachment modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * Name of the `Attachment`.
   */
  public On_AssetAttachment name() {
    _add_field("name");
    return this;
  }
  /**
   * Filename of the `Attachment` `File`.
   */
  public On_AssetAttachment filename() {
    _add_field("filename");
    return this;
  }
  /**
   * Mediatype (MIME) of the `Attachment`.
   */
  public On_AssetAttachment type() {
    _add_field("type");
    return this;
  }
  /**
   * External Id of the `Attachment`.
   */
  public On_AssetAttachment externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * Extension of the `Attachment` `File`.
   */
  public On_AssetAttachment extension() {
    _add_field("extension");
    return this;
  }
  /**
   * Size of the `Attachment` `File` in bytes.
   */
  public On_AssetAttachment size() {
    _add_field("size");
    return this;
  }
  /**
   * Signed `Url` to download the original `AssetAttachment` from Frontify.
   */
  public On_AssetAttachment downloadUrl(AssetAttachment_downloadUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
