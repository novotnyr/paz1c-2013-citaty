package sk.upjs.ics.paz1c.citaty;

class DuplicitnyCitatException extends RuntimeException {
    private final Citat citat;

    public DuplicitnyCitatException(Citat citat) {
        this.citat = citat;
    }

}
