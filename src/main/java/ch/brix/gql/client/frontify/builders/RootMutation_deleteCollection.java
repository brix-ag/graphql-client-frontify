package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteCollection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteCollection> {
  public RootMutation_deleteCollection() {
    super(new ch.brix.gql.client.Call<>("deleteCollection", "DeleteCollection"));
  }
  public RootMutation_deleteCollection args(RootMutation_deleteCollection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteCollection onDeleteCollection(On_DeleteCollection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
