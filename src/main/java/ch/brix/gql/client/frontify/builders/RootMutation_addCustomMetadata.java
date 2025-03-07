package ch.brix.gql.client.frontify.builders;

public class RootMutation_addCustomMetadata extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddCustomMetadata> {
  public RootMutation_addCustomMetadata() {
    super(new ch.brix.gql.client.Call<>("addCustomMetadata", "AddCustomMetadata"));
  }
  public RootMutation_addCustomMetadata args(RootMutation_addCustomMetadata_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addCustomMetadata onAddCustomMetadata(On_AddCustomMetadata typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
