package ch.brix.gql.client.frontify.builders;

public class RootMutation_setCustomMetadata extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SetCustomMetadata> {
  public RootMutation_setCustomMetadata() {
    super(new ch.brix.gql.client.Call<>("setCustomMetadata", "SetCustomMetadata"));
  }
  public RootMutation_setCustomMetadata args(RootMutation_setCustomMetadata_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_setCustomMetadata onSetCustomMetadata(On_SetCustomMetadata typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
