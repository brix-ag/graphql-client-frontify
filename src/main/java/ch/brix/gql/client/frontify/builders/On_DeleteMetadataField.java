package ch.brix.gql.client.frontify.builders;

public class On_DeleteMetadataField extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteMetadataField() {
    super(new ch.brix.gql.client.On("DeleteMetadataField"));
  }
  /**
   * The Id of the deleted `MetadataField`.
   */
  public On_DeleteMetadataField id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** Deleted `MetadataField`. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DeleteMetadataField metadataField(DeleteMetadataField_metadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
