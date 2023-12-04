package ch.brix.gql.client.frontify.input_objects;

public class CreateAttachmentInput extends ch.brix.gql.client.InputObject {
  /**
   * Parent Id.
   */
  public CreateAttachmentInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * File Id. Signed Id returned in `uploadFile`.
   */
  public CreateAttachmentInput fileId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("fileId", v);
    return this;
  }
  /**
   * Attachment name or display name.
   */
  public CreateAttachmentInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * Attachment external Id.
   */
  public CreateAttachmentInput externalId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("externalId", v);
    return this;
  }
}
