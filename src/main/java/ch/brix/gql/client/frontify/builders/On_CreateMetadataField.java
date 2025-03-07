package ch.brix.gql.client.frontify.builders;

public class On_CreateMetadataField extends ch.brix.gql.client.TypeBuilder {
  public On_CreateMetadataField() {
    super(new ch.brix.gql.client.On("CreateMetadataField"));
  }
  /**
   * Created `MetadataField`.
   */
  public On_CreateMetadataField metadataField(CreateMetadataField_metadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
