package ch.brix.gql.client.frontify.builders;

public class On_Attachment extends ch.brix.gql.client.TypeBuilder {
  public On_Attachment() {
    super(new ch.brix.gql.client.On("Attachment"));
  }
  /**
   * `Attachment` Id.
   */
  public On_Attachment id() {
    _add_field("id");
    return this;
  }
  /**
   * The `User` who created the `Attachment` on Frontify.
   */
  public On_Attachment creator(Attachment_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Attachment` creation.
   */
  public On_Attachment createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The `User` who last modified the `Attachment` on Frontify.
   */
  public On_Attachment modifier(Attachment_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Attachment`'s last modification.
   */
  public On_Attachment modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * The `Attachment`'s filename.
   */
  public On_Attachment filename() {
    _add_field("filename");
    return this;
  }
  /**
   * The `Attachment`'s name or title.
   */
  public On_Attachment name() {
    _add_field("name");
    return this;
  }
  /**
   * The `Attachment`'s original file extension.
   */
  public On_Attachment extension() {
    _add_field("extension");
    return this;
  }
  /**
   * The `Attachment`'s Media (MIME) type.
   */
  public On_Attachment type() {
    _add_field("type");
    return this;
  }
  /**
   * The `Attachment`'s size in bytes.
   */
  public On_Attachment size() {
    _add_field("size");
    return this;
  }
  /**
   * The `Attachment`'s External Id.
   */
  public On_Attachment externalId() {
    _add_field("externalId");
    return this;
  }
}
