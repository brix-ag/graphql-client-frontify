package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateCustomMetadataProperty extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateCustomMetadataProperty> {
  public RootMutation_updateCustomMetadataProperty() {
    super(new ch.brix.gql.client.Call<>("updateCustomMetadataProperty", "UpdateCustomMetadataProperty"));
  }
  public RootMutation_updateCustomMetadataProperty args(RootMutation_updateCustomMetadataProperty_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateCustomMetadataProperty onUpdateCustomMetadataProperty(On_UpdateCustomMetadataProperty typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
