package ch.brix.gql.client.frontify.input_objects;

public class DeleteAttachmentInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `Attachment` to delete.
   */
  public DeleteAttachmentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
