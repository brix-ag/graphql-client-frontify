package ch.brix.gql.client.frontify.builders;

public class Collection_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CollectionUserPermissions> {
  public Collection_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "CollectionUserPermissions"));
  }
  public Collection_currentUserPermissions onCollectionUserPermissions(On_CollectionUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
