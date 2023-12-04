package ch.brix.gql.client.frontify.builders;

public class On_DeleteAttachment extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteAttachment() {
    super(new ch.brix.gql.client.On("DeleteAttachment"));
  }
  /**
   * The Id of the deleted `Attachment`.
   */
  public On_DeleteAttachment id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `Attachment` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DeleteAttachment attachment(DeleteAttachment_attachment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
