package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateCollection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateCollection> {
  public RootMutation_updateCollection() {
    super(new ch.brix.gql.client.Call<>("updateCollection", "UpdateCollection"));
  }
  public RootMutation_updateCollection args(RootMutation_updateCollection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateCollection onUpdateCollection(On_UpdateCollection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
