package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeCustomMetadataPropertyOptions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveCustomMetadataPropertyOptions> {
  public RootMutation_removeCustomMetadataPropertyOptions() {
    super(new ch.brix.gql.client.Call<>("removeCustomMetadataPropertyOptions", "RemoveCustomMetadataPropertyOptions"));
  }
  public RootMutation_removeCustomMetadataPropertyOptions args(RootMutation_removeCustomMetadataPropertyOptions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeCustomMetadataPropertyOptions onRemoveCustomMetadataPropertyOptions(On_RemoveCustomMetadataPropertyOptions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
