package ch.brix.gql.client.frontify.builders;

public class RootMutation_createMetadataField extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateMetadataField> {
  public RootMutation_createMetadataField() {
    super(new ch.brix.gql.client.Call<>("createMetadataField", "CreateMetadataField"));
  }
  public RootMutation_createMetadataField args(RootMutation_createMetadataField_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createMetadataField onCreateMetadataField(On_CreateMetadataField typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
