package ch.brix.gql.client.frontify.builders;

public class Marking_position extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MarkingPosition> {
  public Marking_position() {
    super(new ch.brix.gql.client.Call<>("position", "MarkingPosition"));
  }
  public Marking_position onMarkingPosition(On_MarkingPosition typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
