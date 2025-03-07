package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCollection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateCollection> {
  public RootMutation_createCollection() {
    super(new ch.brix.gql.client.Call<>("createCollection", "CreateCollection"));
  }
  public RootMutation_createCollection args(RootMutation_createCollection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createCollection onCreateCollection(On_CreateCollection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
