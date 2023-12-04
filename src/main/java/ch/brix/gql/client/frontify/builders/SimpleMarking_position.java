package ch.brix.gql.client.frontify.builders;

public class SimpleMarking_position extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MarkingPosition> {
  public SimpleMarking_position() {
    super(new ch.brix.gql.client.Call<>("position", "MarkingPosition"));
  }
  public SimpleMarking_position onMarkingPosition(On_MarkingPosition typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
