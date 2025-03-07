package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCustomMetadataProperty extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateCustomMetadataProperty> {
  public RootMutation_createCustomMetadataProperty() {
    super(new ch.brix.gql.client.Call<>("createCustomMetadataProperty", "CreateCustomMetadataProperty"));
  }
  public RootMutation_createCustomMetadataProperty args(RootMutation_createCustomMetadataProperty_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createCustomMetadataProperty onCreateCustomMetadataProperty(On_CreateCustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
