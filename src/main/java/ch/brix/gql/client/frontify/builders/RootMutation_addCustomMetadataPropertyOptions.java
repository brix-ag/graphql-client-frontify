package ch.brix.gql.client.frontify.builders;

public class RootMutation_addCustomMetadataPropertyOptions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddCustomMetadataPropertyOptions> {
  public RootMutation_addCustomMetadataPropertyOptions() {
    super(new ch.brix.gql.client.Call<>("addCustomMetadataPropertyOptions", "AddCustomMetadataPropertyOptions"));
  }
  public RootMutation_addCustomMetadataPropertyOptions args(RootMutation_addCustomMetadataPropertyOptions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addCustomMetadataPropertyOptions onAddCustomMetadataPropertyOptions(On_AddCustomMetadataPropertyOptions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
